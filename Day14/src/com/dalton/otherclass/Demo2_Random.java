package com.dalton.otherclass;
/*
 * * A:Random类的概述
	* 此类用于产生随机数如果用相同的种子创建两个 Random 实例，
	* 则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。
* B:构造方法
	* public Random()
	* public Random(long seed)
* C:成员方法
	* public int nextInt()
	* public int nextInt(int n)(重点掌握)
 */
import java.util.Random;

public class Demo2_Random {
	public static void main(String[] args) {
		Random r = new Random(/*seed*/);  //如果空参，seed就是System.nanoTime
		System.out.println(r.nextInt(/*range*/)); //range[0,n)
	}
}
