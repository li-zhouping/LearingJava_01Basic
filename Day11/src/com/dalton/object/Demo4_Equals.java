package com.dalton.object;

import com.dalton.bean.Student;

public class Demo4_Equals {
	public static void main(String[] args) {
		Student s1 = new Student("张三", 23);
		Student s2 = new Student("张三", 24);
		System.out.println(s1.equals(s2));
		
	}


}
