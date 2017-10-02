package com.dalton.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("xxx.txt");
		int c ;
		while( (c = fr.read()) != -1) {
			System.out.print((char)c);
			
		}
		
		fr.close();
	}
}
