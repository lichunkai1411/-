package com.序列化流.对象字节输出流序列化;

import com.序列化流.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：10:24
 */
//TODO: 注意:对象如果需要序列化,必须实现序列化接口.
public class Test {
    public static void main(String[] args) {
        try (
                // 创建一个对象字节输出流包装原始的字节 输出流
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/study.txt"));
                ){
            // 创建一个Java对象
            User user = new User("admin","张三","123456",32);
            // 序列化对象到文件中去
            oos.writeObject(user);
            System.out.println("序列化对象成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}