package com.dalton.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 模拟试用版软件,试用10次机会, 执行一次就提示一次您还有几次机会,如果次数到了提示请购买正版
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		int times = Integer.parseInt(br.readLine());
		if(times > 0) {
			System.out.println("你还有" + times-- + "次机会");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(times + "");
			fw.close();
		} else {
			System.out.println("你的试用次数已到，请购买正版");
		}
		br.close();
	}
}
