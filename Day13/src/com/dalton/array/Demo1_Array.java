package com.dalton.array;
/*
 * * 数组高级二分查找代码
 * :注意事项
	* 如果数组无序，就不能使用二分查找。
		* 因为如果你排序了，但是你排序的时候已经改变了我最原始的元素索引。

 */
public class Demo1_Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77};
		
		System.out.println(getIndex(arr, 55));
		System.out.println(getIndex(arr, 44));
		System.out.println(getIndex(arr, 52));
		
	}
	
	/**
	 * 二分查找
	 */
	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		
		while(arr[mid] != value) {  //当中间值不等于要找的值，就开始循环查找
			if (arr[mid] < value) { 
				min = mid + 1;
			} else if (arr[mid] > value) {
				max = mid - 1;
			}
			
			mid = (min + max) / 2;
			
			if (min > max) {//如果最小索引大于最大索引，就没有查找的可能性了
				return -1;
			}
		}		
		return mid;
	}
}
