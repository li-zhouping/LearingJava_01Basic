package com.dalton.exception;
/*
 * 	* try...catch的方式处理多个异常
	* JDK7以后处理多个异常的方式及注意事项
 */
public class Demo2_Exception {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44};
		
		try {
			System.out.println(a / b);
			System.out.println(arr[10]);
			arr = null;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出错了");
		}catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("---");
	}
}
