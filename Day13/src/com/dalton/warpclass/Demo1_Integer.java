package com.dalton.warpclass;
/*
 * * A:为什么会有基本类型包装类
	* 将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据。
* B:常用操作
	* 常用的操作之一：用于基本数据类型与字符串之间的转换。
* C:基本类型和包装类的对应
* 
		byte 			Byte
		short			Short
		int				Integer
		long			Long
		float			Float
		double			Double
		char			Character
		boolean			Boolean
 */

/*常见对象(String和int类型的相互转换)
* A:int -- String
	* a:和""进行拼接
	* b:public static String valueOf(int i)
	* c:int -- Integer -- String(Integer类的toString方法())
	* d:public static String toString(int i)(Integer类的静态方法)
* B:String -- int
	* a:String -- Integer -- int
	* public static int parseInt(String s)
	* 
	* 基本数据类型包装其中七种都有parseXXX方法(Character无)，可以将字符串转换成基本数据类型
	* 字符串到字符的转换通过toCharArray就可以
	* */


public class Demo1_Integer {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(60));
		
		Integer i1 = new Integer("100");//完成了字符串到整型的转换
		System.out.println(i1);
		
//		demo1();
//		demo2();
		
		
	}

	private static void demo2() {
		//String ====> int
		String s = "200";
		Integer i3 = new Integer(s);
		int i4 = i3.intValue();    //将Integer转换成int
		
		int i5 = Integer.parseInt(s);  //把String转换成int，推荐用
	}

	private static void demo1() {
		//int ===> String
		int i = 100;
		
		String s1 = i + " ";
		String s2 = String.valueOf(s1);//推荐用
		
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		
		String s4 = Integer.toString(i);
	}

}
