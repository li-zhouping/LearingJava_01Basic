package com.dalton.list;

import java.util.ArrayList;

import com.dalton.bean.Person;

/*
 * 集合嵌套之ArrayList嵌套ArrayList
 * 
 * 案例：年级分为若干班级。年级是大集合，若干班级小集合
 */
public class Demo5_ArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Person>> Grade = new ArrayList<>();//创建年级
		
		ArrayList<Person> firstClass = new ArrayList<>();//创建第一个班级
		firstClass.add(new Person("王歧山", 23));
		firstClass.add(new Person("孟建柱", 24));
		
		ArrayList<Person> secondClass = new ArrayList<>();//创建第一个班级
		secondClass.add(new Person("陈小平", 23));
		secondClass.add(new Person("郭文贵", 24));
		
		Grade.add(firstClass);
		Grade.add(secondClass);
		
		System.out.println(Grade);
		
		//如果要遍历
		
		for (ArrayList<Person> grade : Grade) {
			for (Person person : grade) {
				System.out.println(person);
			}
		}
	}

}
