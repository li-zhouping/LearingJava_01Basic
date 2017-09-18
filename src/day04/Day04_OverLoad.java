package day04;
/*
 * 重载：方法名相同，参数列表不同，与返回值类型无关
 * 重载的分类：参数个数不同；参数类型不同
 */

/*
 * 练习：比较两个数据是否相同。参数类型分别为两个int,两个double
 */

public class Day04_OverLoad {
	public static void main(String[] args) {
		System.out.println(isEqual(2, 3));
		
		System.out.println(isEqual(3.2, 3.2));
	}
	
	public static boolean isEqual(int a, int b) {
		return a == b;
	}
	
	public static boolean isEqual(double a, double b) {
		return a == b;
	}
}
