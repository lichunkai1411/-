package com.打印流.应用输出语句的重定向;

import java.io.PrintStream;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：09:34
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("老骥伏枥");
        System.out.println("志在千里");
        try (
                PrintStream ps = new PrintStream("/Users/lck/Desktop/JavaWeb基础/FileAndIO/src/龟虽寿.txt")
                ){
            System.setOut(ps);
            System.out.println("老骥伏枥");
            System.out.println("志在千里");
            System.out.println("烈士暮年");
            System.out.println("壮心不已");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
