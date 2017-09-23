package com.dalton.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4_Pattern {
	public static void main(String[] args) {
//		demo1();
		
		/*
		 * 需求：把一个字符串中的手机号码获取出来
		 */
		String s = "我的手机号是15505914369，曾经用过15125581654";
		String regex = "1\\d{10}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
//		boolean b = m.find();                //匹配子字符串
//		System.out.println(b);
//		String s1 = m.group();
//		System.out.println(s1);
		while (m.find()) 
			System.out.println(m.group());
		
	}

	private static void demo1() {
		Pattern p = Pattern.compile("a*b"); 
		Matcher m = p.matcher("aaaaaaab");   //要匹配整个字符串
		boolean b = m.matches();
		
		System.out.println(b);
		//以上等价于
		System.out.println("aaaaaaab".matches("a*b"));
	}
}
