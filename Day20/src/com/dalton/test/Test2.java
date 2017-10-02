package com.dalton.test;
/*
 * 在控制台录入文件的路径,将文件拷贝到当前项目下
 * 
 * 1.定义方法，创建录入对象,对键盘录入的路径进行判断，如果是文件就返回
 * 2.在主方法中接收该文件
 * 3.读和写该文件
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException {
		File file = getFile();
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	
	/*
	 * 获取键盘录入的文件路径并返回file对象
	 */
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("请输入路径及文件名：");
			String line = sc.nextLine();
			File file = new File(line);//封装成文件对象并判断
			if (!file.exists()) {
				System.out.println("文件不存在，请重新录入");
			} else if (file.isDirectory()){
				System.out.println("录入的是文件夹路径，请输入文件路径");
			} else {//文件路径
				return file;
			}
		}
		
	}
}
