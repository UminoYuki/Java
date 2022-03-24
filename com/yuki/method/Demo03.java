package com.yuki.method;
/**
 * 在Java5中引入了一种主要用于数组的增强型for循环
 * 数组重点使用，主要遍历数组和集合。
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50}; //定义了一个数组
    
        for(int i = 0; i<5; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("=================");
        //遍历数组的元素
        for (int x:numbers){
            System.out.println(x);
        }
    }
    
}
