package com.File.File;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：07:35
 */
public class FileTest4 {
    public static void main(String[] args) {
        // 1.public String[]List():获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回
        File file = new File("/Users/lck/Desktop/JavaWeb基础");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        // 2.public File[]listFiles():(重点)获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }
    }
}
