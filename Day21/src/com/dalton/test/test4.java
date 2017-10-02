package com.dalton.test;

import java.math.BigInteger;

/*
 * 递归求5的阶乘
 * 
 * 递归的弊端：不能调用次数过多，容易导致栈内存溢出
 * 递归的好处：不用知道循环次数
 * 
 * 构造方法能否递归调用？        不能
 * 递归调用是否必须有返回值？ 不一定。比如递归删除文件夹
 */
public class test4 {
	public static void main(String[] args) {
		System.out.println(fun(1000));
	}

	private static BigInteger fun(long i) {
		if (i == 1) {
			return BigInteger.valueOf(1);
		}else {
			return BigInteger.valueOf(i).multiply(fun(i - 1));
		}
	}
}
