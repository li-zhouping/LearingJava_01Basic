package com.dalton.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.dalton.bean.Person;

/*
 * 什么是对象操作流
	* 该流可以将一个对象写出, 或者读取一个对象到程序中. 也就是执行了序列化和反序列化的操作.
	* 序列化：存档    反序列化：读档
* 使用方式
	* 写出: new ObjectOutputStream(OutputStream), writeObject()
 */
public class Demo3_ObjectOutputStream {
	public static void main(String[] args) throws IOException, IOException {
//		demo1();
		Person p1 = new Person("张三",23);
		Person p2 = new Person("李四",24);
		Person p3 = new Person("王五",25);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.txt"));
		oos.writeObject(list);  //读取到的是一个集合对象
		
		
		
		
	}

	private static void demo1() throws IOException, FileNotFoundException {
		Person p1 = new Person("张三", 23);
		Person p2 = new Person("李四", 24);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
	}
}
