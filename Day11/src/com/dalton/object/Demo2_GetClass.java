package com.dalton.object;

import com.dalton.bean.Student;

public class Demo2_GetClass {
	public static void main(String[] args) {
		Student s = new Student("张三",23);
		
		Class clazz = s.getClass();    //获取对象的字节码文件
		String name = clazz.getName(); //获取名称
		System.out.println(name);
	}
}
