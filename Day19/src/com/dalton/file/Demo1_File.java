package com.dalton.file;

import java.io.File;

/*
 *  File : 构造方法
	* File(String pathname)：根据一个路径得到File对象
	* File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
	* File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 */
public class Demo1_File {
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		
		
	}

	private static void demo3() {
		File parent = new File("E:\\java\\day19\\day19\\笔记+作业");
		String child = "day19笔记.md";
		File file = new File(parent, child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	private static void demo2() {
		String parent = "E:\\java\\day19\\day19\\笔记+作业";
		String child = "day19笔记.md";
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	private static void demo1() {
		File file = new File("E:\\java\\day19\\day19\\笔记+作业\\day19笔记.md");
		System.out.println(file.exists());
		
		File file2 = new File("newfile.txt");
		System.out.println(file2.exists());
	}
}
