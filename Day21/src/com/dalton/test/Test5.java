package com.dalton.test;

import java.io.File;
import java.util.Scanner;

/*
 * 需求:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
 * 
 * 分析：
 * 从键盘接收一个文件夹路径
 * 1、如果录入的是不存在的，给予提示
 * 2、如果录入的是文件路径，给予提示
 * 3、如果是文件夹路径，直接返回
 * 
 * 打印该文件夹下所有的.java文件名
 * 1、获取到该文件夹路径下的所有文件和文件夹，存储在File数组中
 * 2、遍历数组，对每一个文件或文件夹作判断
 * 3、如果是文件且后缀是.java的就打印
 * 4、如果是文件夹，就递归调用
 */
public class Test5 {
	public static void main(String[] args) {
		File dir = getDir();
		printJavaFile(dir);
	}
	
	/*
	 *获取从键盘录入的文件夹路径 
	 */
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径：");
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("录入的文件夹不存在，请重新输入");
			} else if(dir.isFile()) {
				System.out.println("录入的是文件路径，请录入文件夹路径");
			} else {
				return dir;
			}
		}
		
	}
	
	/*
	 * 打印该文件夹下所有的.java文件名
	 */
	public static void printJavaFile(File dir) {
		File[] subFiles = dir.listFiles();
		for (File subfile : subFiles) {
			if(subfile.isFile() && subfile.getName().endsWith(".java")) {
				System.out.println(subfile);
			} else if(subfile.isDirectory()){
				printJavaFile(subfile);
			}
		}
	}
}
