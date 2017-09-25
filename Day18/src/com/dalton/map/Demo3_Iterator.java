package com.dalton.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 另一种迭代方法：
 * 键值对对象找键和值思路：
	* 获取所有键值对对象的集合
	* 遍历键值对对象的集合，获取到每一个键值对对象
	* 根据键值对对象找键和值
 */
public class Demo3_Iterator {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		
//		demo1(map);
		for (Map.Entry<String, Integer> en : map.entrySet()) {//父类引用指向子类对象
//		for (Entry<String, Integer> en : map.entrySet()) {    //直接获取子类对象
			System.out.println(en.getKey() + "=" + en.getValue());
		}
	}

	private static void demo1(Map<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			//获取每一个Entry对象
			Map.Entry<String, Integer> en = it.next();
			//根据Entry对象getKey,getValue
			String key = en.getKey();
			Integer value = en.getValue();
			
			System.out.println(key + "=" + value);
		}
	}
}
