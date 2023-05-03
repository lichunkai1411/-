package com.转换流.字符输出转换流;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：09:00
 */
public class Test1 {
    public static void main(String[] args) {
        // 指定写出去的字符编码
        try (
                // 创建一个文件字节输出流
                OutputStream os = new FileOutputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demoOut.txt");
                // 把原始的字节输出流按照指定的字符集编码转换成字符输出转换流
                Writer osw = new OutputStreamWriter(os, "GBK");
                // 把字符输出流包装成缓冲字符输出流
                BufferedWriter bw = new BufferedWriter(osw);
                ){
            bw.write("我是中国人");
            bw.write("我爱你中国");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
