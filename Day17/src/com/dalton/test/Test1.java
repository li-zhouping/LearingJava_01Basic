package com.dalton.test;

import java.util.HashSet;
import java.util.Random;

/*
 * 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 并把最终的随机数输出到控制台。
 * 
 * 分析：
 * 1、有random类创建随机数对象
 * 2、要求不能重复，存储到一个hashset集合
 * 3、如果HashSet的size小于10就不断存储，如果大于等于10就停止存储
 * 4、通过random类中的nextInt(n)方法获取1-20的随机数，存储在hashset集合中
 * 5、遍历hashset
 */
public class Test1 {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Double> hs = new HashSet<>();
		while(hs.size() < 10) {
			hs.add(r.nextDouble() * 19 + 1);
		}
		for (Double double1 : hs) {
			System.out.println(double1);
		}
	}
}
