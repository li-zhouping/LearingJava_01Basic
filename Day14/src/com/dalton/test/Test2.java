package com.dalton.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 需求：算一下你来到这个世界多少天?
 * 分析： 
 * 1.将生日字符串和今天字符串存储
 * 2.定义日期格式化对象
 * 3.将日期字符串转换成日期对象，获取时间毫秒值
 * 4.两个时间毫秒值相减/1000（变成秒），/60，/60，/24变成天
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		String birthday = "1994年04月12日";
		String today = "2017年9月23日";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		long time = d2.getTime() - d1.getTime();
		
		System.out.println(time/1000/60/60/24);
	}
}
