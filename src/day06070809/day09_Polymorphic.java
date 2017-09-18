package day06070809;
/*
 * 多态（polymorphic）：事物存在的多种形态
 * 前提：要有继承关系；要有方法重写；要有父亲引用指向子类对象
 * 
 * 特点：
 * 成员变量：编译看左边（父类），运行看右边（父类）
 * 成员方法：编译看左边（父类），运行看右边（子类）动态绑定
 * 静态方法：编译看左边（父类），运行看左边（父类）
 */
public class day09_Polymorphic {
	public static void main(String[] args) {
		
		bAnimal a = new bCat();  //父类引用指向子类对象 
		a.eat();				//方法输出子类（动态绑定）
		System.out.println(a.num);//变量输出父类
		//a.method();              //相当于bAnimal.method
		System.out.println("---------------");
		//下面展示多态的好处:当作参数传。这也是开发中多态最常用的情形
		method(new bCat());
		method(new bDog());
	}
	public static void method(bAnimal a) {//可以当作形式参数，接收任意子类对象
		// instanceof 判断前面是否是后面的数据类型
		if (a instanceof bCat) {
			bCat c = (bCat) a;
			c.eat();
			c.catchMice();
		} else if (a instanceof bDog) {
			bDog d = (bDog) a;
			d.eat();
			d.lookHome();
		} else {
			a.eat();
		}
	}
}

class bAnimal {
	int num = 10;
	public void eat() {
		System.out.println("动物吃饭");
	}
	public static void method() {
		System.out.println("father static method");
	}
}
class bCat extends bAnimal {
	int num = 20;
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public static void method() {
		System.out.println("son static method");
	}
	public void catchMice() {
		System.out.println("catchMice");
	}
}

class bDog extends bAnimal {
	public void eat() {
		System.out.println("dog eat meat");
	}
	public void lookHome() {
		System.out.println("look home");
	}
}

/*
 * A.多态的好处：
 * 提高的代码的维护性（继承保证）
 * 提高代码扩展性（由多态保证）
 * B.多态弊端：
 * 不能使用子类的特有属性和行为，需要强转
 */