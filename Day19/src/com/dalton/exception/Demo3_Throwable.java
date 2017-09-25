package com.dalton.exception;
/*
 * Throwable的几个常见方法
	* a:getMessage()
		* 获取异常信息，返回字符串。
	* b:toString()
		* 获取异常类名和异常信息，返回字符串。
	* c:printStackTrace()
		* 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
 */
public class Demo3_Throwable {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());  
			System.out.println(e);	 //调用e.tostring()方法
			e.printStackTrace();     //jvm默认就用这种方式处理异常
		}
	}
}
