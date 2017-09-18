package day06070809;

/*
 * extends 继承
 * Animal是父类，Cat和Dog都是子类
 * 
 * 注意事项：
 * 子类只能继承父类所有的*非私有的*成员方法和成员变量
 * 子类不能继承父类的构造方法，但是可以通过super去访问
 * 不要为了部分功能去继承
 * 子类所有的构造方法默认都会访问父类中的空参构造方法（因为可能会使用父类的数据，默认super ()）
 */

public class Day08_Extends {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.color = "花";
		c.leg = 4;
		c.eat();
		c.sleep();
		
		System.out.println(c.color + c.leg);
	}

}

class Animal {
	String color;
	int leg;
	
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
}

class Cat extends Animal {
	
}

class Dog extends Animal {
	
}
