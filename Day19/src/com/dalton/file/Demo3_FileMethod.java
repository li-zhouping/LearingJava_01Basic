package com.dalton.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 判断功能  （看方法名就知道，不再演示）
	* public boolean isDirectory():判断是否是目录 
	* public boolean isFile():判断是否是文件  //文件夹返回false,文件返回true
	* public boolean exists():判断是否存在
	* public boolean canRead():判断是否可读
	* public boolean canWrite():判断是否可写
	* public boolean isHidden():判断是否隐藏
 * 获取功能
	* public String getAbsolutePath()：获取绝对路径
	* public String getPath():获取路径（与构造方法内的路径一样）
	* public String getName():获取名称
	* public long length():获取长度。字节数
	* public long lastModified():获取最后一次的修改时间，毫秒值
	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
 */
public class Demo3_FileMethod {
	public static void main(String[] args) {
//		demo1();
//		demo2();
	}

	private static void demo2() {
		File dir = new File("D:\\安装包");
		String[] arr = dir.list();  //仅为了获取文件名
		
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("----------");
		File[] subFile = dir.listFiles();  //获取文件对象
		for (File file : subFile) {
			System.out.println(file);
		}
	}

	private static void demo1() {
		File file1 = new File("newfile.txt");
		File file2 = new File("C:\\Users\\Dalton\\eclipse-workspace\\Day19\\newfile.txt");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file1.getName());
		
		Date d = new Date(file1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		System.out.println(sdf.format(d));
	}
}
