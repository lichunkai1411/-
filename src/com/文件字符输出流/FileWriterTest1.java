package com.文件字符输出流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：16:44
 */
public class FileWriterTest1 {
    public static void main(String[] args) {
        try (
                // 创建一个文件字符输出流管道与目标文件接通
//                FileWriter fw = new FileWriter("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/abc.txt"); // 覆盖管道
                FileWriter fw = new FileWriter("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/abc.txt",true); // 追加管道
                ){
            // public void write(int c):写一个字符出去
            fw.write('a');
            fw.write(97);
            fw.write('李');
            fw.write("\r\n"); // 换行
            // public void write(String c)写一个字符串出去
            fw.write("我爱你中国abc");
            fw.write("\r\n");
            // public void write(String c,int pos,int len):写字符串的一部分出去
            fw.write("我爱你中国abc",0,5);
            fw.write("\r\n");
            // public void write(char[]buffer):写一个字符数组出去
            char[]buffer = {'李','春','凯'};
            fw.write(buffer);
            fw.write("\r\n");
            // public void write(char[]buffer,int pos,int len):写字符数组的一部分出去
            fw.write(buffer,0,2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
