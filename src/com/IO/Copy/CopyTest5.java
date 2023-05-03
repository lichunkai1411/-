package com.IO.Copy;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：12:05
 */
public class CopyTest5 {
    public static void main(String[] args) throws Exception {
        // 需求:复制照片
        // 创建一个字节输入流管道与源文件接通
        InputStream is  = new FileInputStream("/Users/lck/Desktop/img/jable-_yumi-015.jpg");
        // 创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("/Users/lck/Desktop/demo/meinv.png");
        // 创建一个字节数组,负责转移字节数据
        byte [] buffer = new byte[1024]; // 1KB
        // 从字节输入流中读取字节数据,写出去到字节输出流中,读多少写出去多少
        int len ;
        while ((len =is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();
        System.out.println("复制完成!");
    }
}
