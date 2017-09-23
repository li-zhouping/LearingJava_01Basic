package com.dalton.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * boolean   hasNext()是否有下一个
 * boolean   hasPrevious()是否有前一个
 * Object    next()返回下一个元素
 * Object    previous();返回上一个元素
 */
public class Demo3_ListIterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("d");
		list.add("e");
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {//获取元素，指针向后移动
			System.out.println(lit.next());
		}
		
		System.out.println("--------------");
		//指针得到后面才能反着遍历。开发中基本用不到了解即可
		while(lit.hasPrevious()) {//获取元素，指针向前移动
			System.out.println(lit.previous());
		}
	}
}
