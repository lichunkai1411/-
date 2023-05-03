package com.File.recursion;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：07:52
 */
public class RecursionTest1 {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        System.out.println("---test1---");// 直接方法递归
        test1();
    }

    public static void test2() {
        System.out.println("---test2---");
        test3();
    }

    public static void test3 () {
        test2(); // 间接方法递归
    }
}
