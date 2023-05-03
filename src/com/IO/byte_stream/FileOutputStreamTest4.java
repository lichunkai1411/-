package com.IO.byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：11:42
 */
public class FileOutputStreamTest4 {
    public static void main(String[] args) throws Exception {
        // 创建一个字节输出流管道与目标文件接通
        // 覆盖管道:覆盖之前的数据
//        OutputStream os = new FileOutputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/lck.txt");
        // 追加数据管道:不会覆盖之前的数据
        OutputStream os = new FileOutputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/lck.txt",true);
        // 开始写字节数据出去
        os.write(97); // 代表a
        os.write('b');

        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes);

        os.write(bytes,0,15);

        // 换行符号
        os.write("\r\n".getBytes());

        // 关闭流
        os.close();
    }
}
