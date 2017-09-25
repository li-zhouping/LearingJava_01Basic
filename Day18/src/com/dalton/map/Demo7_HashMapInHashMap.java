package com.dalton.map;

import java.util.HashMap;

import com.dalton.bean.Student;

/*
 * 集合嵌套之HashMap嵌套HashMap
 * 一个年级有很多班
 * A班是一个MAP，键是学生对象，值是学生归属地
 * B班是一个MAP，键是学生对象，值是学生归属地
 * 为了统一管理，把这些班级对象添加到年级集合中
 */
public class Demo7_HashMapInHashMap {
	public static void main(String[] args) {
		HashMap<Student, String> hmA = new HashMap<>();
		hmA.put(new Student("张三",23), "北京");
		hmA.put(new Student("李四",24), "北京");
		hmA.put(new Student("王五",25), "上海");
		hmA.put(new Student("赵六",26), "深圳");
		
		HashMap<Student, String> hmB = new HashMap<>();
		hmB.put(new Student("香蕉君",23), "北京");
		hmB.put(new Student("似李",24), "北京");
		hmB.put(new Student("葛平",25), "上海");
		hmB.put(new Student("超威蓝猫",26), "深圳");
		
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
		hm.put(hmA, "A班");
		hm.put(hmB, "B班");
		
		System.out.println(hm);
		
		//如何遍历？
		for (HashMap<Student, String> h : hm.keySet()) {
			String Value = hm.get(h); //hm.get(h)根据键对象获取班级HashMap对象
			//再遍历键的双列集合对象
			for (Student key : h.keySet()) {//h.keySet()获取集合中所有的学生对象
				String Value2 = h.get(key);
				
				System.out.println(key + "=" + Value2 + "=" + Value);
			}
		}
	}
}