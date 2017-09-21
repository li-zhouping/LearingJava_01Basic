package com.dalton.test;

import java.util.Scanner;

/*
 * 摸拟登录，给三次机会，并提示还有几次。
 * 用户名和密码都是admin
 * 
 * 分析：键盘录入,Scanner
 *     给三次机会，要循环，要提示几次，需要常量储存并判断
 */
public class Test1_Loading {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int time = 3; time > 0; time--) {
			System.out.println("请输入用户名：");
			String userName = sc.nextLine();
			System.out.println("请输入密码");
			String password = sc.nextLine();

			if ("admin".equals(userName) && "admin".equals(password)) {
				System.out.println("登陆成功");
				break;
			} else {
				if (time == 1) {
					System.out.println("错误次数已到，请明天再来吧");
					break;
				} else {
					System.out.println("录入错误，你还有" + (time-1) + "次机会");
					continue;
				}
			}
		}
	}
}
