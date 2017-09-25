package com.dalton.jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Arrays工具类的asList()方法的使用
 * * 数组-->集合
 *   转了的话，可以用集合的方法，但不能增加或减少元素
 *   基本数据类型转集合，会将整个数组作为一个对象转换。所以建议用引用数据类型转换
 * 
 * Collection中toArray(T[] a)泛型版的集合转数组
 * * 集合-->数组
 *   集合转换数组时，数组长度小了会自动扩充成集合.size()
 */
public class Demo4_AsList {
	public static void main(String[] args) {
//		demo1();
		
//		demo2();
	}

	private static void demo2() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String[] arr = list.toArray(new String[0]); 
		//集合转换数组时，数组长度小了会自动扩充成集合.size()
		for (String string : arr) {
			System.out.println(string);
		}
	}

	private static void demo1() {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);
//		list.add("d");//数组虽然能转集合，但不能增加或减少元素。否则抛出异常
		//不过可以用集合的思想操作数组，可以使用其他集合中的方法
		System.out.println(list);
		
//		int[] arr2 = {11,22,33,44,55};
//		List<int[]> list2 = Arrays.asList(arr2);//泛型其实是一个数组
//		System.out.println(list2);              //会打印这个对象的地址值
		
		Integer[] arr3 = {11,22,33,44,55};      //每一个元素都是一个Integer对象
		List<Integer> list3 = Arrays.asList(arr3);
		System.out.println(list3);              //会打印内容啦
	}
}
