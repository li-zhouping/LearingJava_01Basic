package com.dalton.exception;
/**
 * throws的方式处理异常
	* 定义功能方法时，需要把出现的问题暴露出来让调用者去处理。
	* 那么就通过throws在方法上标识。
 * @author Dalton
 *
 */
public class Demo4_throws {

	public static void main(String[] args) throws Exception {
		Person p = new Person();
		p.setAge(-17);
		System.out.println(p.getAge());
	}
}

class Person{
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
	public void setAge(int age) throws AgeOutOfBoundsException {
		if (age >0 && age <= 150) {
			this.age = age;			
		} else {
//			throw new Exception("年龄非法");
			throw new AgeOutOfBoundsException("年龄非法");
			
		}
	}
	
}
 
class AgeOutOfBoundsException extends Exception {


	public AgeOutOfBoundsException() {
		super();
		
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		
	}
	
}