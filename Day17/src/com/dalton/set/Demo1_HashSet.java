package com.dalton.set;

import java.util.HashSet;

import com.dalton.bean.Person;
/*
 * Set集合，无索引，不可重复，无序(存取不一致）
 */

public class Demo1_HashSet {
	public static void main(String[] args) {
//		demo1();
		demo2();
	}

	private static void demo2() {//对于自定义对象，需要重写hashCode()和equals方法
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三",23));
		hs.add(new Person("张三",23));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		
		System.out.println(hs.size());
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");
		for (int i = 0; i < 10; i++) {
			hs.add(String.valueOf(i));
		}
		
		System.out.println(hs);   //无序
		System.out.println(b1);
		System.out.println(b2);   //不可存重复元素
		
		for (String string : hs) {//可以用Iterator遍历
			System.out.println(string);
		}
	}
}
