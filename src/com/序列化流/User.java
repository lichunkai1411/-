package com.序列化流;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-03
 * Time：10:24
 */
//TODO: 注意:对象如果需要序列化,必须实现序列化接口.
//TODO: 如果不希望参与序列化在属性前加 transient 表示这个成员变量不参与序列化
public class User implements Serializable {
    private String loginName;
    private String userName;
    private transient String password;
    private int age;

    public User() {
    }

    public User(String loginName, String userName, String password, int age) {
        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    /**
     * 获取
     * @return loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{loginName = " + loginName + ", userName = " + userName + ", password = " + password + ", age = " + age + "}";
    }
}
