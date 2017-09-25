package com.dalton.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 
 * 把所有输入的整数倒序排列打印.
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数，每输入一个整数按回车继续输入下一个，完毕输入quit");
		
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num = i2 - i1;
				return num == 0 ? 1 : num;
			}
			
		});
		while(true) {
			String line = sc.nextLine();
			if (!"quit".equals(line)) {
				try {
					ts.add(Integer.parseInt(line));	
				} catch (Exception e) {
					System.out.println("你输入的不是整数，请重试，如果要退出请输入quit");
				}
			} else {
				break;
			}
		}
		System.out.println(ts);
	}
}
