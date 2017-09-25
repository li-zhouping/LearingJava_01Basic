package com.dalton.test;
/*
    * final,finally和finalize的区别
    * final修饰类，方法，变量，参数（不能继承，不能重写，成常量，只能读不能改）
    * finally是try语句体中的一个语句体，不能单独使用，用来释放资源
    * finalize是objective类的方法，当该对象不存在更多引用时，由对象的垃圾回收器调用此方法
* 
	* 如果catch里面有return语句，请问finally的代码还会执行吗?
	     如果会，请问是在return前还是return后。
	     ——打印结果是30，所以finally是在return后执行(在finally执行前，return的值已被确定)
 */
public class Test1 {
	public static void main(String[] args) {
		demo d = new demo();
		System.out.println(d.method());
	}
}

class demo {
	public int method() {
		int x = 10;
		try {
			x = 20;
			System.out.println(1 / 0);
			return x;
		} catch (Exception e) {
			x = 30;
			return x;
		} finally {
			x = 40;
		}
	}
}
