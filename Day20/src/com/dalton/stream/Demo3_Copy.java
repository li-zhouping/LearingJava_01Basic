package com.dalton.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {
	public static void main(String[] args) throws IOException {
//		demo1();            //逐字节拷贝，效率低
//		demo2();			//也不推荐使用，因为有可能会导致内存溢出
		
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("ScreenShot.jpg");
		FileOutputStream fos = new  FileOutputStream("copy.jpg");
//		int len = fis.available();
//		System.out.println(len);
		
		byte[] arr = new byte[fis.available()];	//创建跟文件大小一样的字节数组
		fis.read(arr);							//将文件上的字节读取到内存中（字节数组中）
		fos.write(arr);							//将字节数组中的数据写到文件上
		
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("ScreenShot.jpg");
		FileOutputStream fos = new  FileOutputStream("copy.jpg");
		
		int b;
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	}
}
