package com.dalton.exception;
/*
* A:异常的概述
	* 异常就是Java程序在运行过程中出现的错误。
* B:异常的分类
	* 通过API查看Throwable
	* Error
		* 服务器宕机,数据库崩溃等
	* Exception
* C:异常的继承体系
	* Throwable
		* Error	
		* Exception
			* RuntimeException
 */

/*
 * A:异常处理的两种方式
	* a:try…catch…finally
		* try catch
		* try catch finally
		* try finally 
	* b:throws
 * B:try...catch处理异常的基本格式
	* try…catch…finally
	
    * try:用来检测异常
    * catch：用来捕获异常
    * finally:释放资源
     
 */
public class Demo1_Exception {
	public static void main(String[] args) {
		divideDemo d = new divideDemo();
		try {			
			int x = d.div(10, 0);
			System.out.println(x);
		}catch (ArithmeticException a) {//ArithmeticException a = new ArithmeticException()
			System.out.println("出错了，除数为0了");
		}
	}
}

class divideDemo {
	public int div(int a , int b) {
		return a / b;
	}
}