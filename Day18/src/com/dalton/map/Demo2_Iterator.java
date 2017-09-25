package com.dalton.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 通过查看Map集合的api发现：没有iterator方法，那么双列集合如何迭代呢？
 * 键找值思路：
	* 获取所有键的集合——通过set<E> keyset()
	* 遍历键的集合，获取到每一个键
	* 根据键找值
 */
public class Demo2_Iterator {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23); 
		map.put("李四", 24);
		map.put("王五", 25);
		
//		Integer i = map.get("张三");//根据键获取值
//		System.out.println(i);
		
//		demo1_itetrator(map);
		demo2_for(map);
	}

	private static void demo2_for(Map<String, Integer> map) {
		for (String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
	}

	private static void demo1_itetrator(Map<String, Integer> map) {
		//获取所有的键
		Set<String> keyset = map.keySet();      //获取所有键的集合
		Iterator<String> it = keyset.iterator();//获取keyset的迭代器
		while(it.hasNext()) {
			String key = it.next();				//获取每一个键
			Integer value = map.get(key);		//根据键获取值
			System.out.println(key + "=" + value);
		}
	}
}
