package com.dalton.threadmethod;
/*
 * 
 */
public class Demo2_CurrentThread {
	public static void main(String[] args) {
		new Thread() {
			public void run(){
				System.out.println(this.getName());
			}
		}.start();
		
		new Thread (new Runnable() {
			
			@Override
			public void run() {
				//获取当前正在执行的线程引用
				System.out.println(Thread.currentThread().getName());
			}
		}).start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
