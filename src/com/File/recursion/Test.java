package com.File.recursion;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：08:21
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n-1);
        }
    }

}
