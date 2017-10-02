package com.dalton.test;
/*
 * 递归练习(斐波那契数列)
* 不死神兔
* 故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
* 在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
* 再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，一年内没有发生死亡，
* 问：一对刚出生的兔子，一年内繁殖成多少对兔子?
* 1 1 2 3 5 8 13
 */
public class Test4 {
	public static void main(String[] args) {
//		demo1();
		System.out.println(fun(12));
	}

	private static int fun(int i) {
		if(i == 1) {
			return 1;
		}else if(i == 2) {
			return 1;
		}else {
			return fun(i-2) + fun(i-1);
		}
	}

	private static void demo1() {
		//用数组做
		int[] arr = new int[12];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(arr[arr.length-1]);
	}
}
