package com.yuki.base;
/**
 * 浮点数拓展：如银行业务如何表示？
 */
public class Demo03 {
    public static void main(String[] args) {
        float f = 0.1f; //0.1
        double d = 1.0/10;

        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);

        float d1 = 223233232f;
        float d2 = d1 + 1;
        System.out.println(d1==d2);//true
    }
    
}
