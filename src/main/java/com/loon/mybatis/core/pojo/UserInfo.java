package com.loon.mybatis.core.pojo;

import java.io.Serializable;

/**
 * User:李辉
 * date:2017-02-14 15:00
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 7230595472536934906L;
    private Integer uId;
    private String userName;
    private Integer age;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public UserInfo(Integer uId, String userName, Integer age, String password) {
        this.uId = uId;
        this.userName = userName;
        this.age = age;
        this.password = password;
    }

    public UserInfo(Integer uId, String userName, Integer age) {
        this.uId = uId;
        this.userName = userName;
        this.age = age;
    }

    public UserInfo() {
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uId=" + uId +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
