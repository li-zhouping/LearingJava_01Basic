package com.dalton.warpclass;
/*
 * 	看程序写结果
		
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println("-----------");
	
		Integer i3 = new Integer(197);
		Integer i4 = new Integer(197);
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println("-----------");
	
		Integer i5 = 97;
		Integer i6 = 97;
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
		System.out.println("-----------");
	
		Integer i7 = 197;
		Integer i8 = 197;
		System.out.println(i7 == i8);
		System.out.println(i7.equals(i8));
 */
public class Demo2_Integer {
	public static void main(String[] args) {
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);                //false
		System.out.println(i1.equals(i2));           //true
		System.out.println("-----------");
	
		Integer i3 = new Integer(197);               
		Integer i4 = new Integer(197);               
		System.out.println(i3 == i4);				//false
		System.out.println(i3.equals(i4));			//true
		System.out.println("-----------");
	
		Integer i5 = 97;//自动装箱
		Integer i6 = 97;
		System.out.println(i5 == i6);				//true
		System.out.println(i5.equals(i6));			//true
		System.out.println("-----------");
	
		Integer i7 = 197;							//false
		Integer i8 = 197;							//true
		System.out.println(i7 == i8);
		System.out.println(i7.equals(i8));
		
		
		/*
		 * byte的取值范围内，自动装箱不会创建新的对象，从常量池中获取，相同值是指向同一个地址
		 */
	}
}
