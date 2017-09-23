package com.dalton.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.dalton.bean.Person;

/*
* A:泛型概述<>限定了什么样的引用数据类型
* B:泛型好处
	* 提高安全性(将运行期的错误转换到编译期) 
	* 省去强转的麻烦
* C:泛型基本使用
	* <>中放的必须是引用数据类型 
* D:泛型使用注意事项
	* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)  

 */
public class Demo1_Generic {
	public static void main(String[] args) {
		demo1();
		
	}

	private static void demo1() {
		ArrayList<Person> list = new ArrayList</*Person(此处可以不写)*/>();
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();//next方法只能调用一次，如果调用多次会将指针后移多次
			System.out.println(p.getName()+"..."+p.getAge());
		}
	}
}
