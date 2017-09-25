package com.dalton.map;

import java.util.LinkedHashMap;

/*
 * LinkedHashMap的特点
		* 底层是链表实现的可以保证怎么存就怎么取
 */
public class Demo5_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("张三", 23);
		lhm.put("李四", 24);
		lhm.put("王五", 25);
		lhm.put("赵六", 26);
		
		System.out.println(lhm);
	}
}
