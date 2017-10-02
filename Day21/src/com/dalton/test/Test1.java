package com.dalton.test;

import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
 * 
 * 1、创建输入输出流对象
 * 2、创建集合对象
 * 3、将读到的数据存储在集合中
 * 4、倒着遍历，将数据写到文件上
 * 5、关流
 * 
 * 注意事项：
 * 流对象尽量晚开早关。
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaareverse.txt"));
		
		ArrayList<String> list = new ArrayList<>();
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
