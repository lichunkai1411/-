package com.字节缓冲流.原始流缓冲流的性能分析;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：20:45
 */
public class Test {
    // 复制的视频路径
    private static final String SRC_FILE = "/Users/lck/Desktop/demo/111.MP4";
    // 复制到那个目的地
    private static final String DEST_FILE = "/Users/lck/Desktop/demo/aaa/";

    public static void main(String[] args) {
//        copy1(); // 低级字节流一个一个字节的复制,慢的简直让人无法忍受,直接淘汰!
        copy2();
        copy3();
        copy4();
    }
    private static void copy1(){
        // 记录程序当前执行(开始时间)
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE+"222.MP4")
                ){
            int b ;
            while ((b = is.read()) != -1){
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // 记录程序当前时间(结束时间)
        long end = System.currentTimeMillis();
        // 计算时间差
        System.out.printf("低级字节流一个一个字节复制耗时：%d 毫秒.", (end - start));
    }
    private static void copy2(){
        // 记录程序当前执行(开始时间)
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE+"333.MP4")
                ){
            byte []buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!=-1){
                os.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // 记录程序当前时间(结束时间)
        long end = System.currentTimeMillis();
        // 计算时间差
        System.out.println("此程序运行时间为：" + (end - start) / 1000.0 + "秒");
    }
    private static void copy3(){
        // 记录程序当前执行(开始时间)
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis =  new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE+"444.MP4");
                BufferedOutputStream bos =new BufferedOutputStream(os)
        ){
            byte []buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer))!=-1){
                bos.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // 记录程序当前时间(结束时间)
        long end = System.currentTimeMillis();
        // 计算时间差
        System.out.println("此程序运行时间为：" + (end - start) / 1000.0 + "秒");
    }
    private static void copy4(){
        // 记录程序当前执行(开始时间)
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis =  new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE+"555.MP4");
                BufferedOutputStream bos =new BufferedOutputStream(os)
        ){
            byte []buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer))!=-1){
                bos.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // 记录程序当前时间(结束时间)
        long end = System.currentTimeMillis();
        // 计算时间差
        System.out.println("此程序运行时间为："+(end - start)/1000.0+"秒");
    }
}
