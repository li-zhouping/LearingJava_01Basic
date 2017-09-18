package day06070809;
/*
 * A:final概述
 * 修饰方法，其不能被重写
 * 修饰类，其不能继承
 * 如果修饰变量，变量就变成常量，只能赋值一次，常跟public static连用
* B:对于基本数据类型（整型、浮点型、布尔型和字符型），其值不能改变
*   对于引用类型，引用地址不能改修，但对像中的属性植是可以改变的。
* C:final修饰变量的初始化时机
	* 显示初始化 final int num = 10;
	* 在对象构造完毕前即可 final int num; num = 10;此时才进行赋值  
 */
public class Day08_Final_Keyword {

}

class Father {
	public /*final*/ void print() {//加上final，是最终的，其它类不能再重写该方法
		System.out.println("访问底层数据资源");
	}
	
}

class son extends Father {
	public void print() {
		System.out.println("哈哈，功能被我干掉了");
	}
}
