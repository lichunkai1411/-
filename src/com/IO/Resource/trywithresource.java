package com.IO.Resource;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：12:55
 */
public class trywithresource {
    public static void main(String[] args) {
        try (
                // 注意:这里只能放置资源对象(流对象)
                // 什么是资源?资源都是会实现AutoCloseable接口
                // 创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/study.txt");
                // 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("/Users/lck/Desktop/demo/studycopy.txt");
        ) {

            System.out.println(10 / 0);
            // 创建一个字节数组,负责转移字节数据
            byte[] buffer = new byte[1024]; // 1KB
            // 从字节输入流中读取注解数据,写出去到字节输出流中,读多少写出去多少
            int len; // 记住每次读取了多少个字符
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
