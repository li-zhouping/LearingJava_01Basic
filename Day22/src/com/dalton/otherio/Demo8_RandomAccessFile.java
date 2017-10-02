package com.dalton.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 随机访问流概述
	* RandomAccessFile概述
	* RandomAccessFile类不属于流，是Object类的子类。但它融合了InputStream和OutputStream的功能。
	* 支持对随机访问文件的读取和写入。

 * 方法：read(),write(),seek()
 */
public class Demo8_RandomAccessFile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("h.txt", "rw");
		raf.seek(10);
		raf.write(97);
//		int x = raf.read();
//		System.out.println(x);
		raf.close();
		
	}
}
