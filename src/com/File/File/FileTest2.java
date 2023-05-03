package com.File.File;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-01
 * Time：19:52
 */
public class FileTest2 {
    public static void main(String[] args) {
        // 创建文件对象,指代指某个文件
        File file = new File("/Users/lck/Desktop/JavaWeb基础/banner.txt");
        // public boolean exists() 判断当前文件对象，对应的文件路径是否存在，存在返回true
        System.out.println(file.exists());
        // public boolean isFile() 判断当前文件对象指代的是否是文件，是文件返回true,反之。
        System.out.println(file.isFile());
        // public boolean isDirectory() 判断当前文件对象指代的是否是文件夹，是文件夹返回true,反之。
        System.out.println(file.isDirectory());
        // public String getName() 获取文件的名称（包含后缀）
        System.out.println(file.getName());
        // public long length() 获取文件的大小，返回字节个数
        System.out.println(file.length());
        // public long lastModified() 获取文件的最后修改时间。
        long time = file.lastModified();
        System.out.println(file.lastModified());
        // 转化为时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time));
        // public String getPath() 获取创建文件对象时，使用的路径
        System.out.println(file.getPath());
        // public String getAbsolutePath() 获取绝对路径
        System.out.println(file.getAbsolutePath());
    }
}
