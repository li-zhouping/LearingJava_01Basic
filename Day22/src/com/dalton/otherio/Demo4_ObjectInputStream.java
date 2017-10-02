package com.dalton.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.dalton.bean.Person;

public class Demo4_ObjectInputStream {
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
//		demo1();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f.txt"));
		ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
		for (Person person : list) {
			System.out.println(person);
		}
		
		ois.close();
	}

	private static void demo1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
	}
}
