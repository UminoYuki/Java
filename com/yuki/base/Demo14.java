package com.yuki.base;
/**
 * 二元运算符（二）
 */
public class Demo14 {
    
    public static void main(String[] args) {
        long a = 123123123123123L;
        int b = 123;
        short c = 10;
        byte d = 8;

        System.out.println(a+b+c+d); //Long
        System.out.println(b+c+d); //Int
        System.out.println(c+d); //Int
    }
}
