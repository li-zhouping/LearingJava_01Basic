package com.dalton.thread;
/*
 * 第二种多线程方法：实现Runnable
	* 定义类实现Runnable接口
	* 实现run方法
	* 把新线程要做的事写在run方法中
	* 创建自定义的Runnable的子类对象
	* 创建Thread对象, 传入Runnable
	* 调用start()开启新线程, 内部会自动调用Runnable的run()方法
 */
public class Demo2_Thread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		new Thread(mt).start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("bb");
		}
	}
}

class MyRunable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("aaaaaaa");
		}
	}
	
}
