package com.dalton.test;
/*
 * demo1:
 * 字符串遍历
 * demo2:
 * 统计一个字符串中大写字母字符，小写字母字任，数字字符出现次数，其他字符出现次数
 * ABCDEFGabcdeg123465!@#$%^
 * 分析：字符串是由字符组成的，字符值有范围，通过范围来判断是否包含字符
 *     如果包含就用计数器变量+1

 */
public class Test2 {
	public static void main(String[] args) {
		String s1 = "dalton";

		demo1(s1);
		demo2();
		
		
	}

	private static void demo2() {
		String s2 ="ABCDEFGabcdeg123465!@#$%^";
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);//通过索引获取每一个字符
			if (c >= 'A' && c <= 'Z') {
				big ++;
			} else if (c >= 'a' && c <= 'z') {
				small ++;
			} else if (c >= '0' && c <= '9') {
				num ++;
			} else {
				other ++;
			}	
		}	
		System.out.println(s2 + "中大写字母有" + big + "个，小写字母有" + small + 
				"个，数字字符有" + num + "，其它字符有" + other +"个。");
	}

	private static void demo1(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.print(c + "  ");
		}
	}
}
