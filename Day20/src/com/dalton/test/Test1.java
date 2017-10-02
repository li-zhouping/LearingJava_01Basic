package com.dalton.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 给图片加密
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("b.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c.jpg"));
		
		int b ;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123);//一个数被异或两次，就是他本身。加密时异或，解密时再次异或。
		}
		
		bis.close();
		bos.close();
	}
}
