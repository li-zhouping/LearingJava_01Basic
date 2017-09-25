package com.dalton.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.dalton.bean.Person;

/*
 * TreeSet：排序，唯一
 * 是用来对元素进行排序的。同样可以保证元素唯一，但是不能保证怎么存怎么取
 * 当compareTo方法返回     0 时，集合中只有一个元素
 * 当compareTo方法返回 正数 时，集合中怎么存就怎么取
 * 当compareTo方法返回 负数 时，集合中 倒序 存储
 * * 二叉树
 * * 小的存储在左边（负数）
 * * 大的存储在右边（正数）
 * * 相等不存           （0）
 */


/*
 * 	* a.自然顺序(Comparable)
		* TreeSet类的add()方法中会把存入的对象提升为Comparable类型
		* 调用对象的compareTo()方法和集合中的对象比较
		* 根据compareTo()方法返回的结果进行存储
	* b.比较器顺序(Comparator)
		* 创建TreeSet的时候可以制定 一个Comparator
		* 如果传入了Comparator的子类对象, 那么TreeSet就会按照比较器中的顺序排序
		* add()方法内部会自动调用Comparator接口中compare()方法排序
		* 调用的对象是compare方法的第一个参数,集合中的对象是compare方法的第二个参数
	* c.两种方式的区别
		* TreeSet构造函数什么都不传, 默认按照类中Comparable的顺序(没有就报错ClassCastException)
		* TreeSet如果传入Comparator, 就优先按照Comparator
 */
public class Demo3_TreeSet {
	public static void main(String[] args) {
		//需求：将字符串按照长度排序
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("aaaa");
		ts.add("z");
		ts.add("wc");
		ts.add("dij");
		ts.add("comdskjv");
		System.out.println(ts);
		
		 
		
//		demo1();
	}

	private static void demo1() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("张三",23));
		ts.add(new Person("李四四要",24));
		ts.add(new Person("李四四要",24));
		ts.add(new Person("李四四四",24));
		ts.add(new Person("张五五五五",25));
		ts.add(new Person("赵六六",26));
		
		System.out.println(ts);
	}
}

class CompareByLen implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {//按照字符串的长度比较
		int num = s1.length() - s2.length(); //长度为主要条件
		return num == 0 ? s1.compareTo(s2) : num; //内容为次要条件
	}
	
}
