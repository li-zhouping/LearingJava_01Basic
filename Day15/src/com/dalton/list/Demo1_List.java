package com.dalton.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List集合的特有功能概述
	* void add(int index,E element)
	* E remove(int index)            *注意：删除时不会自动装箱，参数是索引，不要传对象
	* E get(int index)
	* E set(int index,E element)
 */
public class Demo1_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.add(1, "e");    //有索引，要注意索引越界异常的问题
		System.out.println(list);
		
		//通过索引遍历List集合
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//通过Iterator遍历
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
