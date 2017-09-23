package com.dalton.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 带All的方法
		boolean addAll(Collection c)
		boolean removeAll(Collection c)		  //删除交集
		boolean containsAll(Collection c)     //是否包含整个集合
		boolean retainAll(Collection c)       //取交集  调用集合变了true没变false
 */
public class Demo4_Collection {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c2.addAll(c1);                  //将c1中的每一个元素添加到c2中
//		c2.add(c1);						//将c1作为一个元素    添加到c2中
		System.out.println(c2);
		
	}
}
