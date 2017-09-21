package com.dalton.test;
/*
 * * 需求：把数组中的数据按照指定个格式拼接成一个字符串
	* 
			举例：
				int[] arr = {1,2,3};	
			输出结果：
				"[1, 2, 3]"
				
			用StringBuffer的功能实现
			-----------
			分析：
			将数组转换成字任串
			1.返回值类型String
			2.参数列表int[]
 */
public class Test1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(arrayToString(arr));
		
	}
	
	public static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length ; i ++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");
			} else {
				sb.append(arr[i]).append(",");
			}
		}
		return sb.toString();
	}
}

