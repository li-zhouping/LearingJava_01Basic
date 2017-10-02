package com.dalton.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.dalton.bean.Person;

/*
 * 什么是打印流
	* 该流可以很方便的将对象的toString()结果输出, 并且自动加上换行, 而且可以使用自动刷出的模式
	* System.out就是一个PrintStream, 其默认向控制台输出信息
 * 使用方式
	* 打印: print(), println()
	* 自动刷出: PrintWriter(OutputStream out, boolean autoFlush, String encoding) 
	* 打印流只操作数据目的
 */
public class Demo5_PrintStream {
	public static void main(String[] args) throws FileNotFoundException {
//		PrintStream ps = System.out;
//		Person p1 = null;
//		ps.println(p1);
		
		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"), true);
		pw.write(97);  //write是查表，找到对应a打印
		pw.print(97);  //print输出97,底层是用Integer.tostring()
		pw.print("大家好");
		pw.println("你好");
		//自动刷出可以不关闭流的情况下将缓冲区中未写入的数据刷出，仅对println有效
		pw.close();
	}
}
