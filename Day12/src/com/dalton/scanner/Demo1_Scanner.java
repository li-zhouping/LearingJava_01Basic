package com.dalton.scanner;

import java.util.Scanner;

public class Demo1_Scanner {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {//hasNextInt 判断输入的是不是int类型，返回一个布尔值
			int i = sc.nextInt();//键盘录入整数存储在i中
			System.out.println(i);
		} else {
			System.out.println("输入类型错误");
		}
	}
}
