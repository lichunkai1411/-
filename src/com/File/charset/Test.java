package com.File.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-02
 * Time：09:46
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 编码
        String data = "a我b";
        byte[] bytes = data.getBytes(); // 默认按照平台字符集进行编码的
        System.out.println(Arrays.toString(bytes));

        // 按照指定字符集进行编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        // 解码
        String s = new String(bytes); // 按照平台默认字符集进行解码的
        System.out.println(s);

        // 按照指定字符集进行解码
        String s1 = new String(bytes1,"GBK");
        System.out.println(s1);
    }
}
