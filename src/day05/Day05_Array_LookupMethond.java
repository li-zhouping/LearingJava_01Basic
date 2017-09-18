package day05;
import java.util.Scanner;

public class Day05_Array_LookupMethond {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("请输入对应的星期，范围1~7：");
		int week = sc.nextInt();
		
		System.out.println("星期" + getWeek(week));
		
		System.out.println("---------------");
		
		/*
		 * 数组元素查找(查找指定元素第一次在数组中出现的索引)
		 */
		int[] arr = {11,22,33,44,55,66,77,88};
		System.out.println("index=" + getIndex(arr, 22));
	}
	
	/*
	 * 根据索引返回对应的星期
	 * 1.返回值类型char
	 * 2.参数列表int week
	 */
	public static char getWeek(int week) {
		char[] arr = {' ','一','二','三','四','五','六','日'};
		return arr[week];
	}
	public static int getIndex(int[] arr, int value) {
		for (int i = 0 ; i <=  arr.length ;  i++) {
			if (arr[i] == value) {
				return i;
			}
			
		}
		return -1;  //进行到这步循环遍历完成，依然没找到 就返回-1
	}
}
