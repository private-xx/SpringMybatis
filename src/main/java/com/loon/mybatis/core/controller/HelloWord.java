package com.loon.mybatis.core.controller;

/**
 * User:李辉
 * date:2017-01-13 17:19
 */
public class HelloWord {
    String str = new String("good");
    char[] ch ={'a','b','c'};
    public static void main(String[] args) {
       //double x = 10;
       // double n= x/2;
       //lf:if (n*n>10){
       //    n=n/2;
       //
       //}else {
       //    if (n*n<10){
       //        System.out.println(3*n/2);
       //    }
       //}
        HelloWord helloWord = new HelloWord();
        helloWord.change(helloWord.str,helloWord.ch);
        System.out.println(helloWord.str="and");
        System.out.println(1L<<65L);

        String string = "12:25:68";
        string.substring(0,string.lastIndexOf(":"));
        System.out.println(string.substring(0,string.lastIndexOf(":")));
    }
    public void  change(String str,char[] ch){
        str = "test ok";
        ch[0] = 'g';
    }
    public static void spra(double n,double x){
        if (x*x > n){
            spra(n,x/2);
        }else {

        }
    }
    public static double mySqrt(double num, double offSet){
        if(num <= 0) return 0;
        double flag = 10.0;
        int counter = 0;
        do{
            if (Math.abs(flag*flag - num) < offSet) {
                System.out.println(flag);
                return flag;
            }else{
                System.out.println(flag);
                counter++;
                flag = (flag + num/flag)/2;
            }
        }while(counter<100);
        return -1;
    }
}
