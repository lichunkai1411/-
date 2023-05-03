package com.IO.Resource;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：12:35
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println(10/2);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("===finally执行===");
        }
        System.out.println(chu(10,2));
    }
    public static int chu(int a,int b){
        try {
            return a/b;
        }catch (Exception e) {
            e.printStackTrace();
            return -1; // 代表出现错误
        }finally {
            // 千万不要在finally中返回数据
            return 111;
        }
    }
}
