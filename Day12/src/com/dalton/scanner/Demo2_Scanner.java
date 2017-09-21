package com.dalton.scanner;

import java.util.Scanner;

public class Demo2_Scanner {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int i = sc.nextInt();
//		System.out.println("请输入第二个整数：");
//		int j = sc.nextInt();
//		System.out.println("i=" + i + ",j=" + j);

//		System.out.println("请输入第一个字符串："); 
//		String line1 = sc.nextLine();
		System.out.println("请输入第二个字符串：");
		String line2 = sc.nextLine();
//		System.out.println("line1 = " + line1 + ",line2 = " + line2);
		
		System.out.println("i = " + i + ",line 2 = " + line2);
		
		/*
		 * nextInt和nextLine一起用的小问题：
		 * 不执行line2=sc.nextLine()的原因：
		 * nextInt()是键盘录入整数的方法，当我们录入10的时候
		 * 其实在键盘上录入的是10和\r\n，nextInt()方法只获取10就结束了
		 * nextLine()是键盘录入字符串的方法，可以接收任何类型，但是只要遇到\r\n就结束
		 */
		
		/*
		 * solution:
		 * 1）创建一个新的Scanner对象，将两种输入类型分开用两个Scanenr：浪费空间
		 * 2）键盘录入全字符串，都用nextLine方法，之后再根据需要转换成int
		 */
		
	}
}
