package com.yuki.base;
/**
 * 逻辑运算符
 * 短路运算
 */
public class Demo18 {
    public static void main(String[] args) {
        int c = 5;
        boolean d = (c<4)&&(c++<4); //没有执行(c++<4)
        System.out.println(d); //false
        System.out.println(c); //5

        boolean e = (c>4)||(c++<4); //没有执行(c++<4)
        System.out.println(e); //false
        System.out.println(c); //5
    }
    
}
