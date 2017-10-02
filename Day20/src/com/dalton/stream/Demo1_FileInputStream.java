package com.dalton.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 读取文件
 * read()方法读取的是一个字节，为什么返回是int,而不是 byte?
 * 
 * 因为字节输入流可以操作任意类型的文件,比如图片音频等,这些文件底层都是以二进制形式的存储的,
 * 如果每次读取都返回byte,有可能在读到中间的时候遇到111111111那么这11111111是byte类型的-1,
 * 我们的程序是遇到-1就会停止不读了,后面的数据就读不到了,所以在读取的时候用int类型接收,
 * 如果11111111会在其前面补上24个0凑足4个字节,那么byte类型的-1就变成int类型的255了
 * 这样可以保证整个数据读完,而结束标记的-1就是int类型
 */
public class Demo1_FileInputStream {
	public static void main(String[] args) throws IOException {
//		demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		int b;
		while((b = fis.read()) != -1) {
			System.out.println(b);
		}
		
		fis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		int x = fis.read();
		System.out.println(x);
		
		fis.close();
	}
}
