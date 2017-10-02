package com.dalton.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8_TryFinally {
	public static void main(String[] args) throws IOException {
//		demo1();
		
//		demo2();

		
	}

	private static void demo2() throws IOException, FileNotFoundException {
		try(
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		){
			int b ;
			if ((b = fis.read()) != -1) {
				fos.write(b);
			}			
		}//1.7新特性会自动关流
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}			
		} finally {
			try {
				if(fis != null)
					fis.close();				
			} finally {
				if(fos != null)
					fos.close();							
			}
		}
	}
}
