package com.yuki.base;
/**
 * 实例变量
 */
public class Demo10 {
    String name;
	int age;
	
	//main方法
	public static void main(String[] args) {
	    //变量类型  变量名字 = new Demo10();
	    Demo10 demo10 = new Demo10();
	    System.out.println(demo10.name); //null
	    System.out.println(demo10.age); //0
	}
}
