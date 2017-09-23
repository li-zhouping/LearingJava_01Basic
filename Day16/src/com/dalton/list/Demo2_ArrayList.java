package com.dalton.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.dalton.bean.Person;

/*
 * 需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
 *     * 与DEMO1不同点在于是自定义对象
 *     * 
 * 注意事项:重写自定义类的equals()方法。因为contains方法是依赖equals方法
 *        此外，remove方法也是依赖equals方法
 */
public class Demo2_ArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("张三", 23));
		list.add(new Person("张三", 23));
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		
		ArrayList newlist = new ArrayList();
		newlist = getSingle(list);
		System.out.println(newlist);
		
	}
	
	/*
	 * 创建新集合
	 * 1.创建新集合
	 * 2.根据传入的老集合获取迭代器
	 * 3.遍历老集合
	 * 4.通过新集合判断是否包含老集合中的元素，包含就不添加，不包含就添加
	 * **重写了Person类的equals方法  因为contain底层是用equals方法实现的
	 */
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newlist = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(!newlist.contains(obj)) {
				newlist.add(obj);
			}
		}
		return newlist;
	}
	
}
