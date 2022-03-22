package com.yuki.base;
/**
 * 逻辑运算符
 * 与或非
 */
public class Demo17 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: "+(a&&b)); //false
        System.out.println("a || b: "+(a||b)); //true
        System.out.println("!(a && b): "+!(a&&b)); //true
    }
    
}
