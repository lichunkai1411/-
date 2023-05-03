package com.IO.byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：10:13
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        // 创建文件字节输入流管道,与源文件接通
//        InputStream is = new FileInputStream(new File("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/lichunkaistudy.txt"));
        InputStream is = new FileInputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/lichunkaistudy.txt");
        // 开始读取文件的字节数据
//        int i = is.read();
//        System.out.println((char) i);

//        int j = is.read();
//        System.out.println((char) j);

        // 每次读取一个字节返回,如果没有数据了,返回-1
//        int k = is.read();
//        System.out.println((char) k);

        // 使用循环改造上述代码
        int b ;
        while ((b = is.read())!=-1){
            System.out.print((char)b);
        }
        // 读取数据的性能很差!
        // 读取汉字输出会乱码!!无法避免的!
        // 流使用完毕后,必须关闭!释放系统资源!
        is.close();
    }
}
