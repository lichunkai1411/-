package com.File.File;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-01
 * Time：19:37
 */
public class FileTest1 {
    public static void main(String[] args) {
        // 创建一个File对象,指代某个具体文件
        File f1 = new File("/Users/lck/Desktop/JavaWeb基础/banner.txt");
        System.out.println("文件名为:"+f1.getName());// 文件名称
        System.out.println(f1.length()+"字节");// 文件字节大小
        File f2 = new File("/Users/lck/Desktop/JavaWeb基础");
        System.out.println(f2.length()+"字节");
        // File对象可以指代一个不存在的文件路径
        File f3 = new File("/Users/lck/Desktop/JavaWeb基础/aaa.txt");
        System.out.println(f3.length()+"字节");
        System.out.println(f3.exists());// 判断文件是否存在

    }
}
