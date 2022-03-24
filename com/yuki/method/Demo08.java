package com.yuki.method;
/**
 * 递归
 * 栈机制
 */
public class Demo08 {
    public static void main(String[] args) {
        System.out.println(f(5)); //120
    }
    
    public static int f(int n){
        if(n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
    
}
