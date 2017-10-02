package com.dalton.threadmethod;
/*
 * setDaemon()
 * 设置一个线程为守护线程, 该线程不会单独执行, 当其他非守护线程都执行结束后, 自动退出
 */
public class Demo4_SetDaemon {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("aa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("bbbbbb");
				}
			}
		};
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}
