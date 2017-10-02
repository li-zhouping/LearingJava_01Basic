package com.dalton.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/*
 * * A:Properties的概述
	* Properties 类表示了一个持久的属性集。
	* Properties 可保存在流中或从流中加载。
	* 属性列表中每个键及其对应值都是一个字符串。
	* 
	* public Object setProperty(String key,String value)
	* public String getProperty(String key)
	* public Enumeration<String> stringPropertyNames()
	* 
  *存取：load()  store()
 */
public class Demo10_Properties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		demo1();
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.prop"));
		
		System.out.println(prop);
		prop.setProperty("tel", "123456789");
		System.out.println(prop);
		prop.store(new FileOutputStream("config.prop"), null);
	}

	private static void demo1() {
		Properties prop = new Properties();
		prop.setProperty("name", "张三");
		prop.setProperty("tel", "15505914369");
		
//		System.out.println(prop);
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()) {
			String key = en.nextElement();	//获取 prop中的每一个键
			String value = prop.getProperty(key);	//根据键获取值
			System.out.println(key + "..." + value);
		}
	}
}
