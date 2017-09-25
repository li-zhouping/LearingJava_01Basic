package com.dalton.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

import com.dalton.bean.Person;

/*
 * Foreach（增强for循环）
 * 简化数组和Collection集合的遍历
 * 格式：
 * 
		for(元素数据类型 变量 : 数组或者Collection集合) {
			使用变量即可，该变量就是元素
		}
 * 案例演示
	* 数组，集合存储元素用增强for遍历
 */

/*
 * 三种循环能否删除
 * for:		连续的同值元素只删除一个，可能漏删。要加--
 * Iterator:会删除所有同值元素
 * foreach:	不能删除，只能遍历。删除会并发修改异常
 */
public class Demo1_Foreach {
	public static void main(String[] args) {
		demo1();
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
//		demoFor(list);
//		demoIterator(list);
//		demoForeach(list);
		
	}

	private static void demoForeach(ArrayList<String> list) {
		for (String string : list) {//会并发修改异常，不能删除，只能遍历
			if("b".equals(string)) {
				list.remove("b");
			}
		}
	}

	private static void demoIterator(ArrayList<String> list) {
		//2.Iterator删除：会删除所有同值元素
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			if("b".equals(it.next())) {
//				it.remove();
//			}
//			
//		}
		//上下两种写法等价
		for(Iterator<String> it2 = list.iterator(); it2.hasNext();) {
			if("b".equals(it2.next())) {
				it2.remove();
			}
		}
		System.out.println(list);
	}

	private static void demoFor(ArrayList<String> list) {
		//1.普通for删除:连续的相同元素只删除一个，可能漏删，加要--
		for (int i = 0; i < list.size(); i++) {
			if("b".equals(list.get(i))) {//如有多个"b"，全部删除
				list.remove(i/*i--*/);	 //如果要全部删除，要写i--把指针往回移一位		
			}
		}
		System.out.println(list);
	}

	private static void demo1() {
		//		int[] arr = {11,22,33,44,55};
		//		for(int i :arr) {
		//			System.out.println(i);
		//		}
				
				ArrayList<Person> list = new ArrayList<>();
				list.add(new Person("张三",23));
				list.add(new Person("李四",24));
				list.add(new Person("王五",25));
				
				for (Person person : list) {//foreach底层依赖Iterator
					System.out.println(person);
				}
	}
}

