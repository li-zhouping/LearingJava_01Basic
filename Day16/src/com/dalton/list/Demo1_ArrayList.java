package com.dalton.list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
   * 思路：创建新集合方式
 */
public class Demo1_ArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		
		ArrayList newlist = new ArrayList();
		newlist = getSingle(list);
		System.out.println(newlist);
		
	}
	
	/*
	 * 创建新集合
	 * 1.创建新集合
	 * 2.根据传入的老集合获取迭代器
	 * 3.遍历老集合
	 * 4.通过新集合判断是否包含老集合中的元素，包含就不添加，不包含就添加
	 */
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newlist = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(!newlist.contains(obj)) {
				newlist.add(obj);
			}
		}
		return newlist;
	}
}
