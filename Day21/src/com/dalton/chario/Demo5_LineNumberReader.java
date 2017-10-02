package com.dalton.chario;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * LineNumberReader是BufferedReader的子类, 具有相同的功能, 并且可以统计行号
	* 调用getLineNumber()方法可以获取当前行号
	* 调用setLineNumber()方法可以设置当前行号
 */
public class Demo5_LineNumberReader {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("aaa.txt"));
		
		String line;
//		lnr.setLineNumber(100);
		while((line = lnr.readLine()) != null){
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		
		lnr.close();
	}
}
