package com.dalton.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/*
 * 一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
 * 
 * 分析：
 * 1、定义一个List集合，并存储重复的无序的字符串
 * 2、定义一个方法对其排序保留重复
 * 3、打印List集合
 */
public class Test3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ccc");
		list.add("ccc");
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("ddd");
		
		sort(list);
		System.out.println(list);
	}

	/*
	 * 对集合中的元素排序，并保留重复
	 * 1、创建TreeSet对象，因为string本身就具备比较功能，但重复不会保留，所以用比较器
	 * 2、将list集合中所有的元素添加到TreeSet集合中，对其排序，保留重复
	 * 3、清空list集合
	 * 4、将TreeSet集合中排好序的元素添加到list集合中
	 */
	public static void sort(ArrayList<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//比较内容主要条件
				int num = s1.compareTo(s2);
				return num == 0 ? 1 : num;  //1：代表保留重复
			}
			
			
		});
		
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}
}
