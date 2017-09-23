package com.dalton.otherclass;

import java.math.BigInteger;

/*
 * * A:BigInteger的概述
	* 可以让超过Integer范围内的数据进行运算
* B:构造方法
	* public BigInteger(String val)
* C:成员方法
	* public BigInteger add(BigInteger val)              加
	* public BigInteger subtract(BigInteger val)         减
	* public BigInteger multiply(BigInteger val)         乘
	* public BigInteger divide(BigInteger val)           除
	* public BigInteger[] divideAndRemainder(BigInteger val) //取除数和余数
 */
public class Demo4_BigInteger {
	public static void main(String[] args) {
//		long num = 12345678909876543210L;		
		String s = "12345678909876543210";
		BigInteger bigInt = new BigInteger(s);
		BigInteger bigInt2 = new BigInteger("5");
		
		System.out.println(bigInt.add(bigInt2));
	}
}
