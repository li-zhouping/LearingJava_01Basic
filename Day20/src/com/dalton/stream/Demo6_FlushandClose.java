package com.dalton.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * flush()方法
	* 用来刷新缓冲区的,刷新后可以再次写出 
 * close()方法
	* 用来关闭流释放资源的的.
	* 如果是带缓冲区的流对象的close()方法,还会再关闭流之前刷新缓冲区,关闭后不能再写出 

 */
public class Demo6_FlushandClose {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("ScreenShot.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b ;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
		
	}
}
