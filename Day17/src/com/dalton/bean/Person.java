package com.dalton.bean;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
		super();
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	/**
	 * 为什么是31？
	 * 1.31是一个质数
	 * 2.31这个数既不大也不小
	 * 3.31这个数好算,2^5-1,2<<5位-1
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override  //按照姓名长度排序
	public int compareTo(Person o) {
		//比较长度为主要条件
		int length = this.name.length() - o.name.length();
		//比较内容为次要条件
		int num = length == 0 ? this.name.compareTo(o.name) : length;
		//比较年龄为次要条件
		return num == 0 ? this.age - o.age : num;
	}


//	@Override  //按照年龄排序
//	public int compareTo(Person o) {
//		int num = this.age - o.age;  //年龄是比较的主要条件，姓名是比较的次要条件
//		return num == 0 ? this.name.compareTo(o.name) : num ;
//	}
	

//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person)obj;
//		System.out.println("执行了吗？");
//		return this.name.equals(p.name) && this.age == p.age;
//	}
//
//	@Override
//	public int hashCode() {
//		
//		return name.hashCode() + age;
//	}
//	
	
	
}
