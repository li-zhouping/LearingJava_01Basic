package com.dalton.syn;
/*
 * * 1.什么情况下需要同步
	* 当多线程并发, 有多段代码同时执行时, 我们希望某一段代码执行的过程中CPU不要切换到其他线程工作. 这时就需要同步.
	* 如果两段代码是同步的, 那么同一时间只能执行一段, 在一段代码没执行结束之前, 不会执行另外一段代码.
* 2.同步代码块
	* 使用synchronized关键字加上一个锁对象来定义一段代码, 这就叫同步代码块
	* 多个同步代码块如果使用相同的锁对象, 那么他们就是同步的

 */
public class Demo1_Synchronized {
	public static void main(String[] args) {
		Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
	}
}

class Printer {
	static Demo d = new Demo();
	public static void print1() {
		synchronized(d){				//锁对象可以是任意对象,但是被锁的代码需要保证是同一把锁,不能用匿名对象
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
		}
	}

	public static void print2() {	
		synchronized(d){	
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
		}
	}
}

class Demo{
	
}