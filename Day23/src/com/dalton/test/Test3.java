package com.dalton.test;

import java.io.File;

/*
 * 需求:4,从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印, 例如:
	aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
	aaa
		bbb.txt
		ccc.txt
		ddd.txt
	
		eee
			fff.txt
			ggg.txt
 */
public class Test3 {
	public static void main(String[] args) {
		File dir = Test1.getDir();
		tree(dir, 0);
		
	}

	private static void tree(File dir, int lever) {
		File[] subFiles = dir.listFiles();
		for (File file : subFiles) {
			for (int i = 0; i <= lever; i++) {
				System.out.print("\t");
			}
			System.out.println(file.getName());
			if(file.isDirectory()) {
				tree(file, lever+1);
			}
		}
	}
}
