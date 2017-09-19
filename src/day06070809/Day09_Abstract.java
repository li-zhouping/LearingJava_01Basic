package day06070809;
/* Abstract:
 * 用来修饰类：不能创建实例，要去子类去创建实例
 * 用来在父类中修饰方法：没有方法体，子类必须重写该方法，否则不能使用
 * 
 * abstract不能共存的修饰词：
 * 不与static共存：因为abstract的方法没有方法体，用类名.来调用没有意义
 * 不与final共存：因为abstract要求子类重写；final不让子类重写
 * 不与private共存：因为abstract要求子类重写；prvate不让子类访问
 */
public class Day09_Abstract {
	public static void main(String[] args) {
		fatherClass f = new sonClass();
		f.print();
	}
}

abstract class fatherClass{
	int num = 10;
	public void print(){
		System.out.println("father print");
	}
}

class sonClass extends fatherClass{
	public void print() {
		System.out.println("son print");
	}
}