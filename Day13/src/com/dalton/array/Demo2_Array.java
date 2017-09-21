package com.dalton.array;

import java.util.Arrays;

/*
 * * A:Arrays类概述
	* 针对数组进行操作的工具类。
	* 提供了排序，查找等功能。
* B:成员方法
	* public static String toString(int[] a)
	* public static void sort(int[] a)
	* public static int binarySearch(int[] a,int key)

 */
public class Demo2_Array {
	public static void main(String[] args) {
		int[] arr = {11,56,82,42,23,61,77};
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {11,22,33,44,55,66};
		System.out.println(Arrays.binarySearch(arr2, 22));
		//如果不存在，显示-(插入点)-1
		System.out.println(Arrays.binarySearch(arr2, 28));
	}
}
