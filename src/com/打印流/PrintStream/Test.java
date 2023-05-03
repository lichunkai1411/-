package com.打印流.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：09:17
 */
public class Test {
    public static void main(String[] args) {
        try (
                // 创建一个打印流管道
//                PrintStream ps = new PrintStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demoOut.txt", Charset.forName("GBK"));
                PrintStream ps = new PrintStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/demoOut.txt");
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
