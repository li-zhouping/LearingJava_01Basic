package com.dalton.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求:从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
 * 
 * 1.在目标文件中创建原文件夹
 * 2.获取原文件夹中所有的文件和文件夹，存储在File数组中
 * 3.遍历数组
 * 4.如果是文件用IO流读写
 * 5.如果是文件就递归调用
 */
public class Test2 {
	public static void main(String[] args) throws IOException {	
		System.out.println("请输入源文件夹路径：");
		File srcDir = Test1.getDir();
		System.out.println("请输入目标文件夹路径：");
		File destDir = Test1.getDir();
		if(srcDir.equals(destDir)) {
			System.out.println("目标文件夹是源文件夹的子文件夹");
		} else {			
			copy(srcDir,destDir);
		}

	}

	private static void deleteFile(File dir) {
		File[] subFiles = dir.listFiles();
		for (File file : subFiles) {
			if(file.isFile()) {
				file.delete();
			} else {
				deleteFile(file);
			}
		}
		dir.delete();
	}

	public static void copy(File srcDir, File destDir) throws IOException {
		File newDir = new File(destDir, srcDir.getName());
		newDir.mkdir();
		
		File[] subFiles = srcDir.listFiles();
		for (File file : subFiles) {
			if(file.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos =
						new BufferedOutputStream(new FileOutputStream(new File(newDir, file.getName())));
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			} else {//如果是文件夹，递归调用
				copy(file, newDir);
			}
		}
	}
}
