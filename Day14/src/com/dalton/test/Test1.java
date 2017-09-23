package com.dalton.test;

import java.util.Arrays;

/*
 * 需求：我有如下一个字符串:”91 27 46 38 50”
 * 请写代码实现最终输出结果是：”27 38 46 50 91”
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "91 27 46 38 50";
		//切割成字符串数组
		String[] sArr = str.split(" ");
		//将字符串转换成数字并将其存储在一个等长度的int数组中
		int[] arr = new int[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		//排序
		Arrays.sort(arr);
		//将排序后的结果遍历并拼接成一个字符串
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			} else {
				sb.append(arr[i] + " ");
			}
		}
		System.out.println(sb);
	}
}
