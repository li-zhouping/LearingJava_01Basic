package com.dalton.otherio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * BufferedReader的readLine方法
	* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * Scanner
 */
public class Demo7_SystemIn {
	public static void main(String[] args) throws IOException {
//		demo1();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
	}

	private static void demo1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		System.out.println(line);
		br.close();
	}
}
