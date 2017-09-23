package com.dalton.otherclass;

import java.util.Date;
/*
 * * A:Date类的概述.指util包下的，不是sql包下的。
	* 类 Date 表示特定的瞬间，精确到毫秒。 
* B:构造方法
	* public Date()
	* public Date(long date)
* C:成员方法
	* public long getTime()
	* public void setTime(long time)
 */
public class Demo6_Date {
	public static void main(String[] args) {
//		demo1();
//		demo2();
		Date d1 = new Date();
		d1.setTime(1000);              //设置毫秒值，改变时间对象
		System.out.println(d1);
	}

	private static void demo2() {
		Date d1 = new Date();
		//通过时间对象获取当前毫秒值
		System.out.println(d1.getTime());
		//通过系统类方法获取当前毫秒值
		System.out.println(System.currentTimeMillis());
	}

	private static void demo1() {
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(0);     //通过毫秒值创建时间对象
		System.out.println(d2);
	}

}
