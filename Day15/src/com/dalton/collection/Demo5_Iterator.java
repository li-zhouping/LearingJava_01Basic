package com.dalton.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.dalton.bean.Student;
@SuppressWarnings({ "rawtypes", "unchecked" })


/*
 * Iterator<E> 迭代(遍历)
 * *boolean  hasNext()
 * *Object   next()
 * *boolean  remove()
 */
public class Demo5_Iterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Student("张三", 23));
		c.add(new Student("张三2", 23));
		c.add(new Student("张三3", 23));
		c.add(new Student("张三4", 23));
		
//		demo1(c);
		Iterator it = c.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			Student s = (Student)it.next();
			System.out.println(s.getName() + "..." + s.getAge());
		}
		
	}

	private static void demo1(Collection c) {
		//对集合中的元素迭代（遍历）
		Iterator it = c.iterator();     //获取迭代器
//		boolean b1 = it.hasNext();		//判断集合中是否有元素，有就返回true
//		Object obj1 = it.next();
//		System.out.println(b1);
//		System.out.println(obj1);
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
