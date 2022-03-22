package com.yuki.base;
/**
 * 字符拓展：所有的字符本质上还是数字
 * 编码采用Unicode编码，如97表示a，65表示A，一个字符占两个字节
 * 范围：0 - 65536   Excel 2^16=65536
 */
public class Demo04 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1); //强制转换
        System.out.println(c2);
        System.out.println((int)c2); //强制转换
        //所有的字符本质还是数字
        // U0000 UFFF
        char c3 = '\u0061';
        System.out.println(c3); //a
    }
    
}
