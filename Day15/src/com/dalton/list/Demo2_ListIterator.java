package com.dalton.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 需求：我有一个集合，请问，我想判断里面有没有"world"这个元素，
 * 如果有，我就添加一个"javaee"元素，请写代码实现。
 */
public class Demo2_ListIterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("d");
		list.add("e");
		
		System.out.println(list);
//		if (list.contains("world")) {
//			list.add("javaee");
//		}
		
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			if ("world".equals((String)it.next())) {
//				list.add("javeee");
//				//ConcurrentModificationException
//				//遍历的同时在增加元素，并发修改异常
//				//解决方案：用迭代器ListIterator来修改元素
//			}
//		}
		
		//用ListIterator来解决并发修改异常
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			if ("world".equals((String)lit.next())) {
				lit.add("javaee");
			}
		}
		
		System.out.println(list);
		
	}
}
