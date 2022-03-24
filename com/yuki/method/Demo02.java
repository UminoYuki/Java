package com.yuki.method;
/**
 * 打印9*9乘法表
 */
public class Demo02 {
    public static void main(String[] args) {
        for(int j = 1; j<=9; j++){
            for(int i = 1; i<=j; i++){
                System.out.println(j+"*"+i+"="+(j*i));
            }

        }
    }
    
}
