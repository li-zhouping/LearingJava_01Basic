package day04;

/*
   A:案例演示
	* 需求：在控制台输出所有的”水仙花数”

	* 所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	* 举例：153就是一个水仙花数。
	* 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
	* 
	* 再统计一下水仙花数有多少个
 */

public class Day04_For_Test3 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i < 1000 ; i++ ) {
			int gewei = i % 10; //取得个位数
			int shiwei = i / 10 % 10; //取得十位数
			int baiwei = i / 10 / 10; //取得百位数
			if (gewei * gewei * gewei + shiwei * shiwei *shiwei + baiwei * baiwei *baiwei == i) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
