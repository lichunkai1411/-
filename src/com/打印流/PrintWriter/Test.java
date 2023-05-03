package com.打印流.PrintWriter;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：09:24
 */
public class Test {
    public static void main(String[] args) {
        try (
                // 创建一个打印流管道
//                PrintWriter ps = new PrintWriter("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demoOut.txt", StandardCharsets.UTF_8)
//                PrintWriter ps = new PrintWriter("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demoOut.txt", Charset.forName("GBK"))
//                PrintWriter ps = new PrintWriter("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demoOut.txt") // 高级流不支持追加管道
                PrintWriter ps = new PrintWriter(new  FileOutputStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demoOut.txt",true)) // 需要转换为低级流
        ){
            ps.println(97);
            ps.println('a');
            ps.println("我爱你中国");
            ps.println(true);
            ps.println(99.5);

            ps.write(97); // 'a'
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
