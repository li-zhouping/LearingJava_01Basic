package day06070809;
/*
 * 类与类：继承关系，只能单继承，可以多层继承
 * 类与接口：实现关系，可以单实现、多实现；可以继承一个类同时实现多个接口
 * 接口与接口：继承关系，可以单继承、多继承
 * 
 * 抽象类 被继承是"is a"的关系
 * 接口类 被实现是"like a"的关系
 */
public class Day09_Interface02 {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.printA();
		d.printB();
	}
}

interface InterA {
	//public Inter() {}     //接口中没有构造方法
	
	/*public static final*/int num = 10; 
	/*在接口中定义的成员变量都是常量（final int num = 10)
	     默认关键字public static final三个关键字可以互换位置*/
	
	/*public abstract*/ void printA();  //接口只能定义抽象方法
	
}

interface InterB {
	public abstract void printB();
}

interface InterC extends InterA,InterB {
	
}

class Demo2 implements InterA, InterB {//一个类不继承任何类，默认继承Object类
	public void printA() {
//		num = 20;      //接口中定义的变量不能改变
		System.out.println(num);		
	}
	public void printB() {
		System.out.println(num);
	}
}	