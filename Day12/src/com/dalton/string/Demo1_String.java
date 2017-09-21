package com.dalton.string;

public class Demo1_String {
	/*
	 * String()  空构造
	 * String(byte[] bytes)  把字节数组转成字符串
	 * string(byte[] bytes, int index, int length)  把字节数组的一部分转成字符串
	 * String(char[] value)  把字符数组转成字符串
	 * String(char[] value,int index ,int count) 把字符数组的一部分转成字符串
	 * String(String original)  把字符串常量值转成字符串
	 */
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1=" + s1);
		
		byte[] arr1 = {97,98,99};
		String s2 = new String(arr1); //解码
		System.out.println("s2=" + s2);
		
		byte[] arr2 = {97,98,99,100,101,102};
		String s3 = new String(arr2,2,3);//从索引2开始转换3个
		System.out.println("s3=" + s3);
		
		char[] arr3 = {'H','e','l','l','o'};
		String s4 = new String(arr3);//将字符数组转换成字符串
		System.out.println("s4=" + s4);
		String s5 = new String(arr3,1,4);//从索引1开始转换4个
		System.out.println("s5="+s5);
		
		
	}
}

/*
 * 常用方法：
 * boolean equals(Object obj) 区分大小写比较内容
 * boolean equalsIgnoreCase(String str) 忽略大小写比较内容
 * boolean contains(String str) 大字符串是否包含小字符串
 * boolean startWith(String str) 是否以某个指定字符串开头
 * boolean endsWith(String str) 是否以某个指定字符串结尾
 * boolean isEmpty(): 判断字符串是否为空
 * 
 * ""和null的区别
 * ""是字符串常量，同时也是一个String类的对象，当然可以调用String类的方法
 * null是空常量，不能调用任何方法，否则会出现空指针异常，null可以给任何引用数据类型赋值
 */

