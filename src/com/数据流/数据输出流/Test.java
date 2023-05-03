package com.数据流.数据输出流;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：09:43
 */
public class Test {
    public static void main(String[] args) {
        try (
                // 创建一个数据输出流包装低级的字节输出流
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/study.txt"));
                ){
            dos.writeInt(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
