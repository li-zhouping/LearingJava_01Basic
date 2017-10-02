package com.dalton.test;

import java.util.ArrayList;

/*
 * 约瑟夫环，幸运数字，集合中每隔三就删掉一个对象，如此循环，最后剩一个返回
 */
public class Test7 {
	public static void main(String[] args) {
		System.out.println(getLuckyNum(8));
	}

	private static int getLuckyNum(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
		
		int count = 1;   //用来数数的，只要是3的倍数就杀人
		for (int i = 0; list.size() != 1; i++) {
			if(i == list.size()) {//如果i增长到list集合最大的索引+1时，归0
				i = 0;
			}
			if (count % 3 == 0) {//如果是3的倍数就杀人
				list.remove(i);
				i--;
			}
			count ++;
		}
		return list.get(0);
	}
}
