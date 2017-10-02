package com.dalton.threadmethod;
/*
 * thread.getName();
 * thread.setName();
 */
public class Demo1_Name {
	public static void main(String[] args) {
		new Thread("thisIsMyThread") {
			public void run() {
				this.setName("mmmyyythread");
				
				System.out.println(this.getName());
			};
			
		}.start();
	}
}
