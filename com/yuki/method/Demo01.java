package com.yuki.method;
/**
 * 练习1：用while或for实现for循环输出1-1000之间能被5整除的数，并且每行输出三个
 */
public class Demo01 {
    public static void main(String[] args) {
        for (int i = 0; i<=1000; i++){
            if(i%5==0){
                System.out.print(i+"\t"); //"\t"制表符
            }
            if(i%(5*3)==0){
                System.out.println();
                //System.out.print("\n"); //换行
            }
        }
    
        //println 输出完全换行
        //print  输出不完全换行
    }
    
}
