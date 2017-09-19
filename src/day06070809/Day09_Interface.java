package day06070809;
/*
 * 接口的特点：
 * A.interface 接口名  {}          接口中的方法都是抽象的
 * B.类实现接口用implements表示
 *   class 类名  implements 接口名 {}
 * C.接口不能实例化，需要按照多态方式来实例化
 * D.接口的implements
 *   a.抽象类可以，但意义不大。    b.具体类，要重写抽象的方法。
 */

public class Day09_Interface {
	public static void main(String[] args) {
//		Inter i = new Inter();   //接口不能被实例化
		Inter i = new Demo();    //要实例化要按照多态方式，重写接口方法
		i.print();
	}
}

interface Inter {
	public abstract void print();  //接口中的方法都是抽象的
}

class Demo implements Inter {
	public void print() {
		System.out.println("print");
	}
}