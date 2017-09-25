package com.dalton.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 从键盘接收一个字符串, 程序对其中所有字符进行排序
 * 例如键盘输入: helloitcast程序打印:acehillostt
 */
public class Test4 {
	private static Scanner sc;

	public static void main(String[] args) {
		//1.获取输入字符串
		System.out.println("请输入字符串：");
		sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		//2.把字符串转换为ArrayList
		char[] arr = line.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for (Character character : arr) {
			list.add(character);
		}
		
		//3.整理ArrayList，并保留重复内容
		sort(list);
		
		//4.打印
		print(list);
		
	}

	private static void print(ArrayList<Character> list) {
		for (Character character : list) {
			System.out.print(character);
		}
	}

	public static void sort(ArrayList<Character> list) {
		
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num = c1.compareTo(c2);
				return num == 0 ? 1 : num;
			}

			
		});
		
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
		
	}
}
