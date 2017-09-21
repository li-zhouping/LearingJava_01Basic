package com.dalton.test;
/*
 * 需求：
		数组元素：{24, 69, 80, 57, 13}
		请对数组元素进行排序。
			
		冒泡排序
			相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
		
		选择排序
		        从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处

 */
public class Test3_BubbleSort {
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13};
		
//		bubbleSort(arr);
		selectSort(arr);
		print(arr);
		
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {//比较arr.length-1轮
			for (int j = 0; j < arr.length - 1 - i; j++) {
				//-1防止索引越界  -i为了提高效率
				if (arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
					swap(arr, j, j+1);
					
				}
			}
		}
	}
	
	/*
	 * 打印数组
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
	}
	
	/*
	 * 选择排序
	 * 第一次：arr[0]分别与arr[1-4]比较，比较4次
	 * 第二次：arr[1]分别与arr[2-4]比较，比较3次
	 * 第三次：arr[2]分别与arr[3-4]比较，比较2次
	 * 第四次：arr[3]分别与arr[4]比较，比较1次
	 */
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) { //比较arr.length-1轮
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	/*
	 * 换位操作
	 * 如果某方向只针对本类提供，不想让其他类使用，应私有化private
	 */
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
