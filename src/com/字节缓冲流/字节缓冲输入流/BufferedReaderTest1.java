package com.字节缓冲流.字节缓冲输入流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：17:54
 */
public class BufferedReaderTest1 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/abc.txt");
                // 创建一个字符缓冲输入流包装原始的字符输入流
                       BufferedReader br = new BufferedReader(fr)
        ) {
//            char[] buffer = new char[3];
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                System.out.print(new String(buffer, 0, len));
//            }
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
            String line; // 记住每次读取的一行数据
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
