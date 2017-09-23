package com.dalton.regex;
/*
 * 正则表达式的替换功能
	* String类的功能public String replaceAll(String regex,String replacement)
 */
public class Demo2_ReplaceAll {
	public static void main(String[] args) {
		String s = "I1love2bod2yb2ui3lding";
		String regex = "\\d";       //\\d是代表任意数字
		
		String s2 = s.replaceAll(regex, "");
		System.out.println(s2);
	}
}
