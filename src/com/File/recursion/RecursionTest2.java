package com.File.recursion;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：07:52
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i+"的阶乘是"+f(i));
    }
    public static int f(int n){
        // 终结点
        if (n == 1){
            return 1;
        }else {
            return f(n - 1)*n;
        }
    }
}
