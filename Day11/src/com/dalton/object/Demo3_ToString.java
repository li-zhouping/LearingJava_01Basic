package com.dalton.object;

import com.dalton.bean.Student;

public class Demo3_ToString {
	public static void main(String[] args) {
		Student s = new Student("张三",23);
//		String str = s.toString();
		System.out.println(s); //如果直接打印对象的引用，会打印对象的.toString方法
	}
}
