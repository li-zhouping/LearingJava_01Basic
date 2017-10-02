package com.dalton.threadmethod;
/*
 * join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
 * join(int), 可以等待指定的毫秒之后继续
 * 
 * yield让出cpu
 * setPriority()设置线程的优先级
 */
public class Demo5_Join {
	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...aaaaaaaaaaaaaaaaaaaaaa");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					if(i == 2) {
						try {
							//t1.join();						//插队,加入
							t1.join(30);						//加入,有固定的时间,过了固定时间,继续交替执行
							Thread.sleep(10);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					System.out.println(getName() + "...bb");
				
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
