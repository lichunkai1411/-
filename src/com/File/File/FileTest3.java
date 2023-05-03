package com.File.File;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-01
 * Time：20:08
 */
public class FileTest3 {
    public static void main(String[] args) throws Exception {
        // public boolean createNewFile():创建一个新文件（文件内容为空），创建成功，返回true,反之。
        File f1 = new File("/Users/lck/Desktop/demo/lichunkaistudy.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
        // public boolean mkdir():用于创建文件夹，注意：只能创建一级文件夹
        File f2 = new File("/Users/lck/Desktop/demo/aaa");
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);
        // public boolean mkdirs():用于创建文件夹，注意：可以创建多级文件夹
        File f3 = new File("/Users/lck/Desktop/demo/aaa/bbb/ccc");
        boolean mkdirs = f3.mkdirs();
        System.out.println(mkdirs);
        // public boolean delete():删除文件，或者空文件，注意：不能删除非空文件夹。
        System.out.println(f1.delete());
        System.out.println(f3.delete());
    }
}
