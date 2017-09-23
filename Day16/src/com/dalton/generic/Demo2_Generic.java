package com.dalton.generic;
/*
* A:泛型接口概述
	* 把泛型定义在接口上
* B:定义格式	
	* public interface 接口名<泛型类型>
* C:案例演示
	* 泛型接口的使用
	* 
* A:泛型通配符<?>
	* 任意类型，如果没有明确，那么就是Object以及任意的Java类了
* B:? extends E
	* 向下限定，E及其子类
* C:? super E
	* 向上限定，E及其父类
 */
public class Demo2_Generic {
	public static void main(String[] args) {
		
	}
}

interface Inter<T>{
	public void show(T t);
}

class Demo implements Inter<String> {  //推荐用这种

	@Override
	public void show(String t) {
		System.out.println(t);
	}
	
}

//class Demo<T> implements Inter<T> {  //没有必要在实现接口时给自己加一个泛型
//
//	@Override
//	public void show(T t) {
//		System.out.println(t);
//	}
//	
//}