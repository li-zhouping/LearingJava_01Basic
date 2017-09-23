package com.dalton.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.dalton.bean.Student;

/*
 * 遍历-转换成数组遍历
 * toArray()
 */
@SuppressWarnings({"rawtypes","unchecked"})//先不用泛型，忽略相关报错
public class Demo3_Collection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add(new Student("张三",23));
		
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
