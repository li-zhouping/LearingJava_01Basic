package com.dalton.test;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
 */
public class Test2 {
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("请输入字符串");
		sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		char[] charArr = inputStr.toCharArray();
//		for (int i = 0; i < charArr.length; i++) {
//			System.out.println(charArr[i]);
//		}
		HashSet<Character> hs = new HashSet<>();
		for (Character character : charArr) {
			hs.add(character);
		}
		System.out.println(hs);
	}
}
