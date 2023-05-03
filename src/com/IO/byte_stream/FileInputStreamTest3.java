package com.IO.byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：10:13
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) throws Exception {
        // 一次性读取完文件的全部字节到一个字节数组中去
        // 创建一个字符输入流管道与源文件接通
        InputStream is = new FileInputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/sagh.txt");
        // 准备一个字节数组,大小与文件的大小正好一样大
//        File f = new File("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/sagh.txt");
//        long size = f.length();
//        byte [] buffer = new byte[(int) size];
//        int len = is.read(buffer);
//        System.out.println(new String(buffer));
//        System.out.println(size);
//        System.out.println(len);

        // 官方提供
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));

    }
}
