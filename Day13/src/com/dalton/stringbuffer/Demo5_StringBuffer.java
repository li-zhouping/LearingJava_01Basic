package com.dalton.stringbuffer;
/*
 * * A:形式参数问题
	* String作为参数传递
	* StringBuffer作为参数传递 
* B:案例演示
	* String和StringBuffer分别作为参数传递问题
 */

/*
 * 基本数据类型的值传递，不改变其值；
 * 引用数据类型的值传递，改变其值。
 * 
 * String类虽然是引用数据类型，但当作参数传递时和基本数据类型是一样的。
 * 
 */
public class Demo5_StringBuffer {
	public static void main(String[] args) {
		String s = "dalton";
		System.out.println(s);
		change(s);
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer();
		sb.append("dalton");
		System.out.println(sb);
		change(sb);
		System.out.println(sb);
	}
	
	public static void change(StringBuffer sb) {
		sb.append("i love");
	}

	public static void change(String s) {//change方法出栈后，s值就变成垃圾
		s += "i like";
	}
}
