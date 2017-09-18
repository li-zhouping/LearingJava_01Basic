package day04;

public class Day04_DoWhile_Test1 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("i=" + i);
			i ++;
		} while (i <= 10);
	}
}

/*
 *循环结构的三种循环的区别：
 *1. do...while至少执行一次循环体
 *2.而for, while必须先判断条件是否成立，然后决定是否执行循环体
 *如果想在循环后继续使用控制条件的变量，应用while循环体，否则用for循环。
 *因为变量及早的从内存中释放，可以提高内存的使用效率。*/
 