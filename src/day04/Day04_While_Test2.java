package day04;
/*
 * */

public class Day04_While_Test2 {
	public static void main(String[] args) {
		int j = 1;
		while (j <= 10000)/*;*/ { 
			//如果有分号，会一直在判断，在空循环里循环，下面的语句不会执行
			System.out.println("I Love you!");
		j ++;
		}
	}
}
