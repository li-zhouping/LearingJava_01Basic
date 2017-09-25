package com.dalton.file;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能
	* public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
	* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
	* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 * 重命名和删除功能
	* public boolean renameTo(File dest):把文件重命名为指定的文件路径
	* public boolean delete():删除文件或者文件夹
 * 重命名注意事项
	* 如果路径名相同，就是改名。
	* 如果路径名不同，就是改名并剪切。
 * 删除注意事项：
	* Java中的删除不走回收站。
	* 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 */
public class Demo2_FileMethod {
	public static void main(String[] args) throws IOException {
//		demo1();
//		demo2();
//		demo3();
		File file1 = new File("newfile.txt");
		file1.delete();
		File file2 = new File("ccc");
		file2.delete();   //删除失败返回false.因为里面还有文件或子文件夹
	}

	private static void demo3() {
		File file1 = new File("ooo.txt");
		File file2 = new File("D:\\ooo.txt");
		file1.renameTo(file2);
	}

	private static void demo2() {
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		
		File dir2 = new File("ccc\\ddd");
		System.out.println(dir2.mkdir());
		System.out.println(dir2.mkdirs());
	}

	private static void demo1() throws IOException {
		File file = new File("yyy.txt");
		System.out.println(file.createNewFile());//创建成功返回true
	}
}
