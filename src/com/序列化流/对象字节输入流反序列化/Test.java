package com.序列化流.对象字节输入流反序列化;

import com.序列化流.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：10:36
 */
//TODO: 如果不希望参与序列化在属性前加 transient 表示这个成员变量不参与序列化
public class Test {
    public static void main(String[] args) {
        try (
                // 创建一个对象字节输入流管道,包装低级的字节输入流与源文件接通
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/study.txt"))
                ){
            User user = (User) ois.readObject();
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}