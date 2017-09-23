package com.dalton.otherclass;

import java.math.BigDecimal;

/*
 * * A:BigDecimal的概述
	* 由于在运算的时候，float类型和double很容易丢失精度，演示案例。
	* 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal

	* 不可变的、任意精度的有符号十进制数。
* B:构造方法
	* public BigDecimal(String val)
* C:成员方法
	* public BigDecimal add(BigDecimal augend)
	* public BigDecimal subtract(BigDecimal subtrahend)
	* public BigDecimal multiply(BigDecimal multiplicand)
	* public BigDecimal divide(BigDecimal divisor)
 */
public class Demo5_BigDecimal {
	public static void main(String[] args) {
		System.out.println(2.0-1.1);            //0.89999999..
		
		//要创建对象
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));  //0.9
		
		//不用创建对象直接用类方法
		BigDecimal bd3 = BigDecimal.valueOf(2.0);
		BigDecimal bd4 = BigDecimal.valueOf(1.1);
		System.out.println(bd3.subtract(bd4));  //0.9
		
	}
}
