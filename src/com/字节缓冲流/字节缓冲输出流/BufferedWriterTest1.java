package com.字节缓冲流.字节缓冲输出流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：18:08
 */
public class BufferedWriterTest1 {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/abcd.txt",true);
                // 创建一个字符缓冲输出流管道包装原始的字符输出流
                BufferedWriter bw = new BufferedWriter(fw);
                ){
//            fw.write('a');
//            fw.write(97);
//            fw.write('李');
//            fw.write("\r\n");// 换行
//            fw.write("我爱你中国");
//            fw.write("\r\n");
            bw.write('a');
            bw.write(97);
            bw.write('李');
            bw.newLine();// 换行
            bw.write("我爱你中国");
            bw.newLine();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
