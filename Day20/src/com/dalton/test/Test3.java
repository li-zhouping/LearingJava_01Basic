package com.dalton.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出
 * 
 * 分析：
 * 1、创建录入对象
 * 2、创建输出流对象，关联test.txt文件
 * 3、定义无限循环，遇到quit就退出
 * 4、如果不是quit就将内容写出
 * 5、关闭流
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据，输入quit退出");
		FileOutputStream fos = new FileOutputStream("test.txt");
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
			fos.write(line.getBytes());
			fos.write("\r\n".getBytes());
		
		}
		fos.close();
	}
}
