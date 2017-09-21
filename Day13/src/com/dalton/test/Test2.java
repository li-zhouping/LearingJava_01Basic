package com.dalton.test;

/*
 * 需求：把字符串反转
			举例：键盘录入"abc"		
			输出结果："cba"
			
		用StringBuffer的功能实现	

 */
public class Test2 {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		return sb.toString();
	}
}
