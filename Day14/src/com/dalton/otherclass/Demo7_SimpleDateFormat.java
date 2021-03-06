package com.dalton.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* A:DateFormat类的概述
	* DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
	* 是抽象类，所以使用其子类SimpleDateFormat
* B:SimpleDateFormat构造方法
	* public SimpleDateFormat()
	* public SimpleDateFormat(String pattern)
* C:成员方法
	* public final String format(Date date)
	* public Date parse(String source)
 */
public class Demo7_SimpleDateFormat {
	public static void main(String[] args) throws ParseException {
//		demo1(); 
//		demo2();
//		demo3();
//		demo4();
	}

	private static void demo4() throws ParseException {
		//将时间字符串转换成日期对象
		String str = "2008/08/08  08:08:08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		Date d = sdf.parse(str);           //将时间字符串转换成日期对象
		
		System.out.println(d);
	}

	private static void demo3() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));
	}

	private static void demo2() {
		Date d = new Date();   							//获取当前时间对象
		SimpleDateFormat sdf = new SimpleDateFormat();  //创建日期格式化类对象
		System.out.println(sdf.format(d));				//17-9-23 上午5:17
	}

	private static void demo1() {
		//		DateFormat df = new DateFormate();   //DateFormat是抽象类不能实例化
		
		//相当于父类引用指向子类对象   右边的方法返回一个子类对象（SimpleDateFormat）
		DateFormat df1 = DateFormat.getDateInstance();
	}
}
