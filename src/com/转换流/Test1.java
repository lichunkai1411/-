package com.转换流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：08:55
 */
public class Test1 {
    public static void main(String[] args) {
        try (
                // 创建一个文件字符输入流与源文件接通
                // 代码编辑:UTF-8 文件编码:GBK
                Reader fr = new FileReader("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demo.txt");
                // 把文件字符输入流包装成缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);
                ){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
