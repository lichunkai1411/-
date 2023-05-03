package com.文件字符输入流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：13:09
 */
public class FileReaderTest1 {
    public static void main(String[] args) {
        try (
                // 创建一个文件字符输入流管道与源文件接通
                Reader reader = new FileReader("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/study.txt");
                ){
            // 读取文本文件的内容
//            int c; // 记住每次读取字符的编号
//            while ((c=reader.read())!=-1){
//                System.out.print((char) c);
//            }

            // 每次读取多个字符
            char [] buffer = new char[3];
            int len ;// 记住每次读取多少个字符
            while ((len = reader.read(buffer))!=-1){
                System.out.print(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
