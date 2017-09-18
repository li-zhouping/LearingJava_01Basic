package day06070809;
/*
 * A:什么是方法重写
	* 重写:子父类出现了一模一样的方法(注意:返回值类型可以是子父类,这个我们学完面向对象讲) 
* B:方法重写的应用：
	* 当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法。这样，即沿袭了父类的功能，又定义了子类特有的内容。
* C:案例演示
	* ios7,ios8
	* 
*注意事项：*父类中的私有方法不能重写（因为根本就无法继承）；
*        *子类重写父类方法时，访问权限不能更低；最好就一致；
*        *父亲是静态方法，子类也必须重写成静态方法

 */
public class Day08_Extends_Override {
	public static void main(String[] args) {
		IOS8 iPhone = new IOS8();
		iPhone.siri();
		iPhone.call();
	}
}

class IOS7{
	public void call() {
		System.out.println("call");
	}
	public void siri() {
		System.out.println("Speak English");
	}
}

class IOS8 extends IOS7 {
	public void siri() {
		System.out.println("说中文");
		super.siri();   //如果不想保留原有功能，就直接不写这一句
	}
}

/*
 * override:重写， 子父类中方法声明一样的方法。返回值类型要保持一致
 * overload:重载，本类中出现的方法名一样，参数列表不同的方法。可以改变返回值类型
*/