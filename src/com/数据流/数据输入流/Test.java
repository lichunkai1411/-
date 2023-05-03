package com.数据流.数据输入流;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：09:48
 */
public class Test {
    public static void main(String[] args) {
        try (
                // 创建一个数据输出流包装低级的字节输出流
                DataInputStream dis = new DataInputStream(new FileInputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/study.txt"))
        ){
            int i = dis.readInt();
            System.out.println(i);
            double v = dis.readDouble();
            System.out.println(v);
            boolean b = dis.readBoolean();
            System.out.println(b);
            String s = dis.readUTF();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
