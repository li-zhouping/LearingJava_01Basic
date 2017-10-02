package com.dalton.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("大家好");
		fw.write("\r\n");
		fw.write(97);
		fw.close();
	}
}
