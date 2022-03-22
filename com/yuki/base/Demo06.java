package com.yuki.base;
/**
 * 类型转换
 */
public class Demo06 {
    public static void main(String[] args) {
        int i =128;
        byte b = (byte) i; //内存溢出
        double a = i; //自动转换
        //强制转换  (类型)变量名  高-->低
        //自动转换   低-->高
        System.out.println(i); //182
        System.out.println(b); //-128
        System.out.println(a); //128
    }
    
}
