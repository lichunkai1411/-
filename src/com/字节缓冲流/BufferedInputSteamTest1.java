package com.字节缓冲流;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：17:18
 */
public class BufferedInputSteamTest1 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/abc.txt");
                // 定义一个字节缓冲输入流包装原始的字节输入流
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/abcdef.txt");
                // 定义一个字节缓冲输出流包装原始的字节输出流
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
