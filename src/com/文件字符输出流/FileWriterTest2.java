package com.文件字符输出流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：16:44
 */
public class FileWriterTest2 {
    public static void main(String[] args) throws Exception {
                // 创建一个文件字符输出流管道与目标文件接通
                FileWriter fw = new FileWriter("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/abc.txt",true); // 追加管道
            // 写字符数据出去
            fw.write('a');
            fw.write('b');
            fw.write('c');
            fw.write('d');
            fw.write("\r\n"); // 换行


            fw.write("我爱你中国");
            fw.write("\r\n");

            fw.write("我爱你中国");

//            fw.flush(); // 刷新流
//            fw.write("张三");
//            fw.flush();

            fw.close(); // 关闭流,关闭流包含刷新操作!
    }
}
