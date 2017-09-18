package day06070809;
/*
 * 猜数字小游戏
 */
import java.util.Scanner;
public class Day07_Math {
	public static void main(String[] args) {
		
		//Math.random会生成>=0.0,<1.0的伪随机数
		//(int)(Math.random()*100)+1 1~100
		int number = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个1~100之间的整数：");
		while (true) {
			int input = sc.nextInt();
			
			if (input == number) {
				System.out.println("你猜对了");
				break;
			} else if (input < number){
				System.out.println("你猜小了");
			} else {
				System.out.println("你猜大了");
			}
		}
	}

}
