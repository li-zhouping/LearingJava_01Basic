package day04;
/*
 * * A:练习题
* 
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//在此处填写代码
			}
			System.out.println(“Java基础班”);
		}
		
		我想在控制台输出2次:“Java基础班“
		我想在控制台输出7次:“Java基础班“
		我想在控制台输出13次:“Java基础班“	

 */

public class Day04_Practice {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			if(x % 3 == 0) {
//				break;    //只在x=1,2时输出，输出2次
//				continue; 
				//只 在x=3,6,9时不进行接下来的块内语句并返回进入下一循环，共输出7次
				System.out.println("Java基础班");
				//在x=3,6,9时多执行一次输出，加上外部的10次，共13次
			}
			System.out.println("Java基础班");
		}
		
	}
}
