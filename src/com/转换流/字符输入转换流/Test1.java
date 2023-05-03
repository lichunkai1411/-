package com.转换流.字符输入转换流;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：08:46
 */
public class Test1 {
    public static void main(String[] args) {
        try (
                // 得到文件的原始字节流(GBK的字节流形式)
                InputStream is = new FileInputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demo.txt");
                // 把原始的字节输入流按照指定的字符集编码转换成字符输入流
                Reader isr =  new InputStreamReader(is,"GBK");
                // 把字符输入流包装成缓冲字符输入流
                BufferedReader br = new BufferedReader(isr);
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
