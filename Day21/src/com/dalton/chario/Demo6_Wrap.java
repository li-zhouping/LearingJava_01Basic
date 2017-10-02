package com.dalton.chario;
/*
 * 装饰设计模式
 * 1、获取被装饰类的引用
 * 2、在构造方法中传入被装饰类的对象
 * 3、对功能进行升级
 * 
 * 为什么用装饰而不用继承？耦合性没那么强
 */
public class Demo6_Wrap {
	public static void main(String[] args) {
		LearningStudent ls = new LearningStudent(new Student());
		ls.code();
	}
}

interface Coder{
	public void code();
}

class Student implements Coder{

	@Override
	public void code() {
		System.out.println("javase");
		System.out.println("javaweb");
	}
	
}

class LearningStudent implements Coder {
	//1、获取被装饰类的引用
	private Student s;
	//2、在构造方法中传入被装饰的对象
	public LearningStudent(Student s) {
		this.s = s;
	}
	//3、对功能进行升级
	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("数据库");
		System.out.println("大数据");
		System.out.println("...");
	};
	
}