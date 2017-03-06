package com.loon.mybatis.core.controller;

/**
 * User:李辉
 * date:2017-02-27 11:02
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println(test(0));

    }
    public static int test(int i){
        try {
            i= 10/i;
            return i;
        }catch (Exception e)
        {
            return i;
        }finally {
            i++;
            System.out.println(i);
        }
    }
}
