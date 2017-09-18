package day05;
/*
* A:二维数组概述
* B:二维数组格式1
	* int[][] arr = new int[3][2]; 
* C:二维数组格式1的解释
* D:注意事项
	* a:以下格式也可以表示二维数组
		* 1:数据类型 数组名[][] = new 数据类型[m][n];
		* 2:数据类型[] 数组名[] = new 数据类型[m][n];
	* B:注意下面定义的区别
	* 
			int x;
			int y;
			int x,y;
			
			int[] x;
			int[] y[];
			
			int[] x,y[];	x是一维数组,y是二维数组 
 */

public class Day05_Array_2Darray {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};
		
		for (int i = 0; i < arr.length; i++) {//获取到每个二维数组中的一维数组
			for (int j = 0; j < arr[i].length ; j++) {//获取每个一维数组中的元素
				System.out.print(arr[i][j]);
			}
			System.out.println(); //每获取完一个一维数组，回车
		}
	}

}
