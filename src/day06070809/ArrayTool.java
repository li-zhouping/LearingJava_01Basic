package day06070809;

/**
 * 这是一个数组工具类，里面封装了查找数组最大值，打印数组，数组反转的方法
 * @author Dalton
 * @version v1.0
 * 数组工具类：
 * 1）获取最大值
 * 2）数组的遍历
 * 3）数组的反转
 */

public class ArrayTool {
	/*
	 * 如果一个类中的所有方本都是静态的，需要多做一步，私有构造方法，目的是不让其他类创建本类对像
	 * 直接用类名.调用即可
	 */
	private ArrayTool(){};
	
	//1）获取最大值
	/**
	 * 这是获取数组中最大值的方法
	 * @param arr 接收一个int类型的数组
	 * @return 返回数组中的最大值
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length ; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//2）数组的遍历
	/**
	 * 这是遍历数组并打印的方法
	 * @param arr 接收一个int类型的数组
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//3）数组的反转.
	/**
	 * 这是数组反转的方法
	 * @param arr
	 */
	public static void reverse(int[] arr) {
		for (int i = 0 ; i < arr.length/2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
}
