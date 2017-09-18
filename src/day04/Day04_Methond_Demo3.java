package day04;
import java.util.Scanner;
/*
* A:案例演示
	* 需求：根据键盘录入九九乘法表，在控制台输出星形
 */
public class Day04_Methond_Demo3 {
	private static Scanner sc;

	public static void main(String[] args) {
	sc = new Scanner(System.in);
	System.out.println("请输入几乘几的乘法表：");
	int num = sc.nextInt();
	
	doPrint(num); //返回值是void就直接单独调用
	}
	
	public static void doPrint (int a) {
		for (int i = 1; i <= a ; i++) { //行数
			for (int j = 1; j <= i ; j++) { //列数
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		
		return;  //如果返回类型是void，可以省略
	}
}
