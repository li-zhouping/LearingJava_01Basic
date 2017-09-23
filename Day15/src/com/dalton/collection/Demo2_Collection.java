package com.dalton.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 注意:
 * 		collectionXxx.java使用了未经检查或不安全的操作.
	注意:要了解详细信息,请使用 -Xlint:unchecked重新编译.
	java编译器认为该程序存在安全隐患

 *      boolean add(E e)                 //添加元素
		boolean remove(Object o)         //删除指定元素
		void    clear()                  //清空集合
		boolean contains(Object o)       //是否包含
		boolean isEmpty()                //是否为空
		int     size()                   //获取集合中元素个数
		
		add方法如果是List集合一直都返回true,因为List集合中可以存储重复元素
		               如果是Set集合，当存储重复元素时就会返回false

	
 */
@SuppressWarnings({"rawtypes","unchecked"})//先不用泛型，忽略相关报错
public class Demo2_Collection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.remove("b");
		System.out.println(c);
		c.clear();
		System.out.println(c.isEmpty());
		
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		System.out.println(c.size());
	}
}
