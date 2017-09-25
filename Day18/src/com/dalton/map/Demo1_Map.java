package com.dalton.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * * A:Map集合的功能概述
	* a:添加功能
		* V put(K key,V value):添加元素。
			* 如果键是第一次存储，就直接存储元素，返回null
			* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
	* b:删除功能
		* void clear():移除所有的键值对元素
		* V remove(Object key)：根据键删除键值对元素，并把值返回
	* c:判断功能
		* boolean containsKey(Object key)：判断集合是否包含指定的键
		* boolean containsValue(Object value):判断集合是否包含指定的值
		* boolean isEmpty()：判断集合是否为空
	* d:获取功能
		* Set<Map.Entry<K,V>> entrySet():   获取Entry对象的set集合
		* V get(Object key):根据键获取值
		* Set<K> keySet():获取集合中所有键的集合
		* Collection<V> values():获取集合中所有值的集合
	* e:长度功能
		* int size()：返回集合中的键值对的个数
 */
public class Demo1_Map {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//1.添加功能
		Integer i1 = map.put("张三", 23); 
		map.put("李四", 24);
		map.put("王五", 25);
		
		System.out.println(map);//底层依赖hash，不是怎么存怎么取
		System.out.println(i1);//返回null，返回的是被覆盖的值
		
		//2.删除功能
		Integer i2 = map.remove("李四");
		System.out.println(map);
		System.out.println(i2);//remove返回的是被删除的值
		
		//3.判断功能
		boolean b1 = map.containsKey("张三");
		System.out.println(b1);
		System.out.println(map.isEmpty());
		
		//4.获取功能
		Collection<Integer> c = map.values();//获取所有值的集合
		System.out.println(c);
		
		//5.获取长度
		System.out.println(map.size());      //获取键值对个数
	}
}
