package com.dalton.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 1.什么是内存输出流
	* 该输出流可以向内存中写数据, 把内存当作一个缓冲区, 写出之后可以一次性获取出所有数据
 * 2.使用方式
	* 创建对象: new ByteArrayOutputStream()
	* 写出数据: write(int), write(byte[])
	* 获取数据: toByteArray()
 */
public class Demo2_ByteArrayOutputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);
		}
//		byte[] newArr = baos.toByteArray();
//		System.out.println(new String(newArr));
		System.out.println(baos);
		fis.close();
	}
	
}
