package com.dalton.otherclass;

import java.util.Calendar;

/*
 * * A:成员方法
	* public void add(int field,int amount)
	* public final void set(int year,int month,int date)
 * * B:案例演示
	* Calendar类的成员方法使用
 */
public class Demo8_Calendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		System.out.println(rightNow);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));//月是从0开始编号的，最大11
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//周日是第一天，周六最后一天
		
		System.out.println(c.get(Calendar.YEAR) + "年" + getNumber((c.get(Calendar.MONTH)+1))
				+ "月" + getNumber(c.get(Calendar.DAY_OF_MONTH)) + "日" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
		
		System.out.println("--------------");
		
		c.add(Calendar.YEAR, -1);      //对指定的字段进行加减  //2016年
		c.set(2008, 7, 8);             //2008年8月8日
		
		System.out.println(c.get(Calendar.YEAR) + "年" + getNumber((c.get(Calendar.MONTH)+1))
		+ "月" + getNumber(c.get(Calendar.DAY_OF_MONTH)) + "日" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
		
		
		
	}
	
	/*
	 * 将星期存储表中进行查表
	 */
	public static String getWeek(int week) {
		String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		
		return arr[week];
	}
	
	/*
	 * 将一位数字用0补齐两位数
	 */
	public static String getNumber(int num) {
//		if (num > 9) {
//			return "" + num;
//		} else {
//			reutrn "0"  + num;
//		}
		return num > 9 ? "" + num : "0" + num;
	}
}
