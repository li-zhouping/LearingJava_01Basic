package com.dalton.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * 序列流可以把多个字节输入流整合成一个
 * 从序列流中读取数据时, 将从被整合的第一个流开始读, 读完一个之后继续读第二个, 以此类推.
 * *整合两个： SequenceInputStream(InputStream, InputStream)
 * *整合多个： SequenceInputStream(Enumeration)
 */
public class Demo1_SequenceInputStream {
	public static void main(String[] args) throws IOException {
//		demo1(); 
//		demo2();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");	//创建输入流对象,关联a.txt
		FileInputStream fis2 = new FileInputStream("b.txt");	//创建输入流对象,关联b.txt
		FileInputStream fis3 = new FileInputStream("c.txt");	//创建输入流对象,关联c.txt
		Vector<FileInputStream> v = new Vector<>();					//创建vector集合对象
		v.add(fis1);											//将流对象添加
		v.add(fis2);
		v.add(fis3);
		Enumeration<FileInputStream> en = v.elements();				//获取枚举引用
		SequenceInputStream sis = new SequenceInputStream(en);	//传递给SequenceInputStream构造
		FileOutputStream fos = new FileOutputStream("d.txt");
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
	
		sis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");			//创建输入流对象,关联a.txt
		FileInputStream fis2 = new FileInputStream("b.txt");			//创建输入流对象,关联b.txt
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);	//将两个流整合成一个流
		FileOutputStream fos = new FileOutputStream("c.txt");			//创建输出流对象,关联c.txt
		
		int b;
		while((b = sis.read()) != -1) {									//用整合后的读
			fos.write(b);												//写到指定文件上
		}
		
		sis.close();
		fos.close();
	}
}
