package com.dalton.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.dalton.bean.Student;

/*
 * TreeMap集合键是Student值是String的案例
 * 要么让Student类实现comparable接口
 * 要么创建TreeMap时同时创建一个比较器
 */
public class Demo6_TreeMap {
	public static void main(String[] args) {
//		demo1();
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o1.getName().compareTo(o2.getName());
				return num == 0 ? o1.getAge() - o2.getAge() : num;
			}
			
		});
		tm.put(new Student("张三", 23), "北京");
		tm.put(new Student("李四", 14), "上海");
		tm.put(new Student("王五", 25), "广州");
		tm.put(new Student("赵六", 26), "深圳");
		
		System.out.println(tm);
	}

	private static void demo1() {
		TreeMap<Student, String> tm = new TreeMap<>();
		tm.put(new Student("张三", 23), "北京");
		tm.put(new Student("李四", 14), "上海");
		tm.put(new Student("王五", 25), "广州");
		tm.put(new Student("赵六", 26), "深圳");
		
		System.out.println(tm);
	}
}
