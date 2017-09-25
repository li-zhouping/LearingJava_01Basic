package com.dalton.test;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 */
public class Test2 {
	public static void main(String[] args) {
		File dir = new File("E:\\");
		
//		demo1(dir);
		demo2(dir);
	}

	private static void demo2(File dir) {
		String[] arr = dir.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				File file = new File(dir,name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
			
		});
		for (String string : arr) {
			System.out.println(string);
		}
	}

	private static void demo1(File dir) {
		//		String[] arr = dir.list();
		//		for (String string : arr) {
		//			if(string.endsWith(".jpg")) {
		//				System.out.println(string);
		//			}
		//		}
				
				File[] subFiles = dir.listFiles();
				for (File subfile : subFiles) {
					if(subfile.isFile() && subfile.getName().endsWith(".jpg")) {
						System.out.println(subfile);
					}
				}
	}
}
