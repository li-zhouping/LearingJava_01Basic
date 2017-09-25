package com.dalton.set;
/*
 * * LinkedHashSet的特点
 * 	    * 底层是链表实现的，是Set集合中唯一能保证  怎么存怎么取 的对象
		* 可以保证怎么存就怎么取 
 */

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		
		System.out.println(lhs);
	}
	
}
