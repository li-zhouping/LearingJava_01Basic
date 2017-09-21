package com.dalton.string;
/*
 * Stiring常用方法
 * 
 * int  length() 获取长度 (注意跟数组.length属性分开，这个没有括号)
 * char charAt(int index)  获取索引位置的字符
 * int  indexOf(int ch)  返回此字符串中第一次出现处的索引.相应的有：lastIndexOf
 * int  indexOf(int ch, int fromIndex)  返回此字符串中指定位置后第一次出现处的索引
 * String substring(int start)截取字符串，默认到末尾。！！要用新的字符串记录！！
 * String substring(int strat, int end)指定位置截取字符串！！要用新的字符串记录！！
 */
public class Demo3_String_Method {
	public static void main(String[] args) {
		String s1 = "dalton";
		System.out.println(s1.length());   //5
		String s2 = "你好世界";
		System.out.println(s2.length());   //4 不是8
		
		char c =s2.charAt(2);
		System.out.println(c);
		
		
		System.out.println(s1.indexOf(97));  //即找a。如果不存在返回-1
		System.out.println(s1.indexOf('a')); //与上行一样，会自动提升
		
		byte[] arr = s2.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
