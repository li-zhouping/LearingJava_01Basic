package day06070809;

/*
 * * A:构造方法概述和作用
	* 给对象的数据(属性)进行初始化
* B:构造方法格式特点
	* a:方法名与类名相同(大小也要与类名一致)
	* b:没有返回值类型，连void都没有
	* c:没有具体的返回值return;
	* 
	* a:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
	* b:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
		* 注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
		* 
		* Static静态，该成员变量（属性）所有实例共享，节省空间。
 */

public class Day07_FacingObject_Test01 {
	public static void main(String[] args) {
		Person p1 = new Person();  //在创建对像的时候，就自动调用了构造方法
		p1.SetName("zhenqihang");
		p1.setAge(24);
		p1.show();
		
		Person p2 = new Person();
		p2.SetName("zebatlas");
		p2.setAge(38);
//		p2.SetCountry("america");
		p2.show();
		
		Person p3 = new Person();
		p3.SetName("Youma");
		p3.setAge(22);
		p3.show();
		
	}

}

class Person {
	private String name;
	private int age;
	private static String country = "japan";
	
	//构造方法
	public Person() {	}; //空参构造
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void show() {
		System.out.println(this.name + "..." + this.age + "..." + Person.country);
	}
	
}