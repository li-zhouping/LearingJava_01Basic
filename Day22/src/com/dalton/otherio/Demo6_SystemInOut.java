package com.dalton.otherio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/*
 * 1.什么是标准输入输出流(掌握)
	* System.in是InputStream, 标准输入流, 默认可以从键盘输入读取字节数据
	* System.out是PrintStream, 标准输出流, 默认可以向Console中输出字符和字节数据
* 2.修改标准输入输出流(了解)
	* 修改输入流: System.setIn(InputStream)
	* 修改输出流: System.setOut(PrintStream)
 */
public class Demo6_SystemInOut {
	public static void main(String[] args) throws IOException {
//		demo1();
		System.setIn(new FileInputStream("a.txt")); //改变标准输入流
		System.setOut(new PrintStream("b.txt"));	//改变标准输出流
		
		InputStream is = System.in; //获取标准键盘输入流，默认指向键盘，改变后指向文件
		PrintStream ps = System.out;//标准输出流，默认指向控制台，改变后指向文件
		
		int b;
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		
		is.close();
		ps.close();
		
	}

	private static void demo1() throws IOException {
		InputStream is = System.in;
		int x = is.read();
		System.out.println(x);
		
		is.close();
	}
}
