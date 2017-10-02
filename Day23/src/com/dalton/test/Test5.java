package com.dalton.test;

import java.math.BigInteger;

/*
 * 需求:求出1000的阶乘所有零和尾部零的个数
 */
public class Test5 {
	public static void main(String[] args) {
//		demo1();
//		demo2();
	}

	private static int demo2() {//获取末尾的0个数
		BigInteger bi1 = new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(String.valueOf(i));
			bi1 = bi1.multiply(bi2);
		}
		
		String str = bi1.toString();
		
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if('0' != str.charAt(i)) {
				break;
			} else {
				count++;
			}
		}
		return count;
	}

	private static int demo1() {//求所有0个数
		BigInteger bi1 = new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(String.valueOf(i));
			bi1 = bi1.multiply(bi2);
		}
		
		String str = bi1.toString();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if('0' == str.charAt(i)) {
				count ++;
			}
		}
		return count;
	}
}
