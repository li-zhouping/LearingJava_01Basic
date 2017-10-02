package com.dalton.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * FileOutputStream在创建对象的时候如果没有这个文件会帮我们创建出来
 * 如果有这个文件，就会先清空
 * 如果要追加，要用FileOutputStream(String name,boolean b);把b写成true
 */
public class Demo2_FileOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		fos.write(97);//虽然写出的是一个int数，但是到文件上的是一个字节，会自动去除前三个八位
		fos.write(98);
		fos.write(99);
		
		fos.close();
	}
}
