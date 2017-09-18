package day06070809;
/*
 * * 使用继承前的学生和老师案例
	* 属性:姓名,年龄
	* 行为:吃饭
	* 老师有特有的方法:讲课
	* 学生有特有的方法:学习
 */

public class Day08_Extends_Test1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Dalton");
		s1.setAge(23);
		System.out.println(s1.getName() + s1.getAge());
		s1.study();
		
		System.out.println("------------------");
		Teacher t1 = new Teacher();
		t1.setName("wang");
		t1.setAge(24);
		System.out.println(t1.getName() + t1.age);
	}

}

class aPerson {
	String name; //姓名
	int age;     //年龄
	
	public aPerson() {};//空参构造
	public aPerson(String name, int age) {//有参构造
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("eat");
	}
}
class Student extends aPerson{
	public Student() {};
	public Student(String name, int age) {
		super(name, age);
	}
	public void study(){
		System.out.println("study");
	}
}
class Teacher extends aPerson {
	
	public Teacher() {};//空参构造
	public Teacher(String name, int age) {//有参构造
		super(name, age);
	}
	public void teach() {
		System.out.println("teaching");
	}
}