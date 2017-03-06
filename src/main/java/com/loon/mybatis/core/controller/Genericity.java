package com.loon.mybatis.core.controller;

/**
 * User:李辉
 * date:2017-03-01 11:39
 */
public class Genericity {
    public static <T> void getUser(T t){

    }
    public static <T> void display(T t) {
        System.out.println(t.getClass());
    }
}
