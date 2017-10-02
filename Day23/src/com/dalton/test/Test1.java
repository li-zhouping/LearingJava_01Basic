package com.dalton.test;

import java.io.File;
import java.util.Scanner;

/*
 * 需求:1,从键盘接收一个文件夹路径,统计该文件夹大小
 * 
 * 接收一个文件夹路径
 * 1.创建键盘录入对象
 * 2.定义一个无限循环
 * 3.将键盘录入的结果存储并封装成file对象
 * 4.对file对象判断
 * 5.将文件夹路径对象返回
 * 
 * 统计该文件夹大小
 * 1.定义一个求和变量
 * 2.获取该文件夹下所有的文件和文件夹listfiles()
 * 3.遍历数组
 * 4.判断，是文件就计算大小并累加
 * 5.判断是文件夹递归调用
 * 6.返回求和变量
 */
public class Test1 {
	public static void main(String[] args) {
		File dir = getDir();
		System.out.println(getFileLength(dir));
		
	}
	
	public static File getDir() {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("请输入一个文件夹路径");
			String line = sc.nextLine();
			File inputline = new File(line);
			if(inputline.isFile()) {
				System.out.println("你输入的是文件路径，请输入文件夹路径");
				continue;
			} else if (inputline.isDirectory()) {
				return inputline;
			} else {
				System.out.println("输入非法，请重新输入");
				continue;
			}
		}
		
	}
	
	public static long getFileLength(File dir) {
		long len = 0;
		File[] subFiles = dir.listFiles();
		for (File file : subFiles) {
			if(file.isFile()) {
				len = len + file.length();
			}
			else {//是文件夹路径
				len = len + getFileLength(file);
			}
		}
		return len;
		
	}
}
