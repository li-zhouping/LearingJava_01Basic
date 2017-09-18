package day04;
import java.util.Scanner;
/*
 * * A:案例演示
	* 需求：键盘录入两个数据，返回两个数中的较大值
* B:案例演示
	* 需求：键盘录入两个数据，比较两个数是否相等     
 */
public class Day04_Methond_Demo2 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数");
		int y = sc.nextInt();
		
		//1.比大小
//		int max = getMax(x, y);
//		System.out.println(max);
		
		//2.是否相等
		boolean result = isEqual(x, y);
		System.out.println(result);
	}
	
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}
	
	public static boolean isEqual(int a, int b) {
//		return a == b ? true : false; 
		return a == b;   //用这种方式写更加简单
	}

}
