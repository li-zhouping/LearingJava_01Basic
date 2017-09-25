package com.dalton.exception;
/*
 * * A:finally的特点
	* 被finally控制的语句体一定会执行
	* 特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
* B:finally的作用
	* 用于释放资源，在IO流操作和数据库操作中会见到
 */
public class Demo5_Finally {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println("除数为0了");
//			System.exit(0);  //退出了java虚拟机，finally就不执行了
			return;
		} finally {
			System.out.println("看看我执行了吗");
		}
	}
}
