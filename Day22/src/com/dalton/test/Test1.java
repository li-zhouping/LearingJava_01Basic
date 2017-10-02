package com.dalton.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		//创建内存输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] arr = new byte[5];
		int len;
		while((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		System.out.println(baos);
		
		fis.close();
	}
}
