package com.dalton.object;

public class Demo1_HashCode {
	public static void main(String[] args) {
		Object obj = new Object();
		int hashCode = obj.hashCode();
		System.out.println(hashCode);
	}
}
