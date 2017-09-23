package com.dalton.test;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 需求：键盘录入任意一个年份，判断该年是闰年还是平年
 * 
 * 分析：
 * 1.键盘录入年 Scanner
 * 2.创建Calendar对象
 * 3.set那一年的3月1日
 * 4.将日向前-1
 * 5.判断日是多少天，如果是29天返回true，否则返回false
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int inputyear = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(inputyear, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		if (c.get(Calendar.DAY_OF_MONTH) == 29) {
			System.out.println("该年是闰年");
		} else {
			System.out.println("该年是平年");
		}
		
	}
}
