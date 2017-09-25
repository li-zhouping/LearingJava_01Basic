package com.dalton.test;

import java.util.HashMap;

/*
 * 需求：统计字符串中每个字符出现的次数
			String str = "aaaabbbcccccccccc";
 * 分析：
 * 1、把字符串转换成char[]
 * 2、创建TreeMap或HashMap，添加每一个字符
 * 3、添加时判断Map是否包含这个字符，包含就使其值+1
 * 4、输出Map
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "aaaabbbcccccccccc";
		char[] arr = str.toCharArray();  //转换成字符数组
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : arr) {
//			if (!hm.containsKey(c)) {
//				hm.put(c, 1);
//			} else {
//				hm.put(c, hm.get(c)+1);
//			}
			hm.put(c, !hm.containsKey(c)? 1 : hm.get(c)+1);
		}
		System.out.println(hm);
	}
}
