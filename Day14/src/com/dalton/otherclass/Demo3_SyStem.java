package com.dalton.otherclass;
/*
 * * System 类包含一些有用的类字段和方法。它不能被实例化。 
 * 成员方法
	* public static void gc()   //垃圾回收器
	* public static void exit(int status)
	* public static long currentTimeMillis()
	* pubiic static void arraycopy(Object src, 
	                     int srcPos, Object dest, int destPos, int length)
 */
public class Demo3_SyStem {
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
		
	}

	private static void demo4() {
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		
		System.arraycopy(src, 0, dest, 0, 5);
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i] + " ");
		}
	}

	private static void demo3() {
		long start = System.currentTimeMillis();
		for (int i = 0 ; i < 1000; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);  //获取运行时间的毫秒值
	}

	private static void demo2() {
		System.exit(0);               //退出jvm 非0状态是异常终止
		System.out.println("1111");
	}

	private static void demo1() {
		for (int i = 0; i < 100; i++) {
			new Demo();
		}
		System.gc();          //运行垃圾回收器
	}
}

class Demo {//一个源文件中不允许定义两个public类

	@Override
	public void finalize() {		//是系统自动执行的
		System.out.println("垃圾被清扫了");
	}
}
