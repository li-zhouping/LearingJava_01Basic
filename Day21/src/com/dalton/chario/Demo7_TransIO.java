package com.dalton.chario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
 * (使用指定的码表读写字符) 
* FileReader是使用默认码表读取文件, 如果需要使用指定码表读取, 
* 那么可以使用InputStreamReader(字节流,编码表)
* 
* FileWriter是使用默认码表写出文件, 如果需要使用指定码表写出, 
* 那么可以使用OutputStreamWriter(字节流,编码表)
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo7_TransIO {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr =
				new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8");
		OutputStreamWriter osw = 
				new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");
		
		int c;
		while((c = isr.read()) != -1) {
			osw.write(c);
		}
		
		isr.close();
		osw.close();
	}
}
