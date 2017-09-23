package com.dalton.otherclass;
/*
 * * A:Math类概述
	* Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
* B:成员方法
	* public static int abs(int a)
	* public static double ceil(double a)
	* public static double floor(double a)
	* public static int max(int a,int b) min自学
	* public static double pow(double a,double b)
	* public static double random()
	* public static int round(float a) 参数为double的自学
	* public static double sqrt(double a)
 */
public class Demo1_Math {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-23.3));  //取绝对值，23.3
		
		//ceil：天花板（向上取整，结果是double）
		System.out.println(Math.ceil(13.0));  //13.0
		System.out.println(Math.ceil(12.43)); ///13.0
		
		//floor：地板 （向下取整，结果是double）
		System.out.println(Math.floor(23.9)); //23.0
		System.out.println(Math.floor(23.0)); //23.0
		
		//max：获取两值中的最大值。相应的还是min
		System.out.println(Math.max(23.3, 3.89));  //23.3
		
		//pow:求幂。前面的数是底数，后面是指数
		System.out.println(Math.pow(2, 3));   //8.0  2*2*2
		
		//random：生成0.0到1.0之间的随机小数[0.0,1.0)
		System.out.println(Math.random());
		
		//round:四舍五入
		System.out.println(Math.round(12.9));  //13
		System.out.println(Math.round(12.3));  //12
		
		//sqrt：开平方
		System.out.println(Math.sqrt(2));   //1.414...
		
	}
}
