package com.yuki.base;
/**
 * 一元运算符
 */
public class Demo15 {
    public static void main(String[] args) {
        int a = 3;

        int b = a++; //执行代码后，先给b赋值，再自增
        //a++  a = a + 1
        System.out.println(a); //4
        //a++  a = a + 1
        int c = ++a; //执行代码后，先自增，再给b赋值

        System.out.println(a); //5
        System.out.println(a); //5
        System.out.println(b); //3
        System.out.println(b); //3
        System.out.println(c); //5
        System.out.println(c); //5
    }
    
}
