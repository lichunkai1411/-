package com.File.recursion;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：07:52
 */
// TODO:本方法可以优雅的代开软件
public class RecursionTest3 {
    public static void main(String[] args) throws Exception {
        searchFile(new File("/Applications/QQ.app/Contents/MacOS/"),"QQ");
    }

    /**
     * 去目录下搜索某个文件
     *
     * @param dir 目录
     * @param fileName 要搜索的文件名称
     */
    public static void searchFile(File dir, String fileName) throws Exception {
        // 把非法的情况拦截住
        if (dir == null || !dir.exists() || dir.isFile()) {
            return; // 代表无法搜索
        }
        // dir不是null,存在,一定是目录对象
        // 获取当前目录下的全部以及文件对象
        File[] files = dir.listFiles();
        // 判断当前目录下是否还存在一级文件对象,一级是否可以拿到一级文件对象
        if (files != null && files.length > 0) {
            // 遍历全部以及文件对象
            for (File file : files) {
                // 判断文件是否是文件,还是文件夹
                if (file.isFile()){
                    // 是文件,判断这个文件是否是要找的文件
                    if (file.getName().contains(fileName)){
                        System.out.println(file.getAbsolutePath());
                        Runtime runtime = Runtime.getRuntime();
                        runtime.exec(file.getAbsolutePath());
                    }
                }else {
                    // 是文件夹,继续重复这个过程(递归)
                    searchFile(file,fileName);
                }
            }
        }
    }
}
