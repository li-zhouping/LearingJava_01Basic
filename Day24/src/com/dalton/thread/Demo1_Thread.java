package com.dalton.thread;
/*
 * 继承Thread
	* 定义类继承Thread
	* 重写run方法
	* 把新线程要做的事写在run方法中
	* 创建线程对象
	* 开启新线程start(), 内部会自动执行run方法
 */
public class Demo1_Thread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("bbbb");
		}
	}
}

class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("aaaaaaaaaa");
		}
	}
}