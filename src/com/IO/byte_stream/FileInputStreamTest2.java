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
public class FileInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        // 创建一个字节输入流对象代表直接输入流管道与源文件接通
        InputStream is = new FileInputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/study.txt");
        // 开始读取文件中的直接数据:每次读取多个字节
//        byte[]buffer = new byte[3];
//        int i = is.read(buffer);
//        String s = new String(buffer);
//        System.out.println(s);
//        System.out.println("单次读取字节的数量:"+i);
//        int i1 = is.read(buffer);
        // 注意:读取多少,倒出多少
//        String s1 = new String(buffer,0,i1);
//        System.out.println(s1);
//        System.out.println("单次读取字节的数量:"+i1);
//        int i2 = is.read(buffer);
//        System.out.println(i2);

        // 使用循环改造
        byte[] buffer = new byte[3];
        int len; // 记住每次读取了多少个字节
        while ((len=is.read(buffer))!=-1) {
            // 注意:读取多少,倒出多少
            String s = new String(buffer, 0, len);
            System.out.print(s);
        }
        // 性能得到了提升
        // 该方案也不能避免读取汉字输出乱码的问题!!
        is.close();
    }
}
