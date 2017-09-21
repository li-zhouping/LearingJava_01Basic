package com.dalton.string;

public class Demo2_String_Test {
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
		
		
	}

	private static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3 == s2);             //false
		System.out.println(s3.equals(s2));        //ture
	}

	private static void demo4() {
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2);                  //ture
		System.out.println(s1.equals(s2));             //ture
	}

	private static void demo3() {
		String s1 = new String("abc");// 记录堆内存的地址值
		String s2 = "abc";//记录常量池的地址值
		System.out.println(s1 == s2);                  //false
		System.out.println(s1.equals(s2));             //Ture
	}

	private static void demo2() {
		String s1 = new String("abc");   
		//这句语句创建了几个对象？2个。一个堆内存对象，一个常量池"abc"对象
	}

	private static void demo1() {//常量池中没有这个字符串对象就创建，有就直接用
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);                  //true
		System.out.println(s1.equals(s2));             //ture
	}

}
