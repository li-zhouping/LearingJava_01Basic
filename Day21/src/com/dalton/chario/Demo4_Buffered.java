package com.dalton.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 带缓冲区的流流中的特殊方法
 * readLine()和newLine()方法)	
* BufferedReader的readLine()方法可以读取一行字符(不包含换行符号)
* BufferedWriter的newLine()可以输出一个跨平台的换行符号"\r\n"
* 
* newline()与\r\n的区别：
* newline()是跨平台的方法，\r\n支持的是windows系统
 */
public class Demo4_Buffered {
	public static void main(String[] args) throws IOException {
//		demo1();
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		String line;
		
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();
	}
}
