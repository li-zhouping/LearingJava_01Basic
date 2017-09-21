package com.dalton.stringbuffer;
/*
 * * A:StringBuffer的替换功能
	* public StringBuffer replace(int start,int end,String str):
		* 从start开始到end用str替换
* B:StringBuffer的反转功能
	* public StringBuffer reverse():
		* 字符串反转
		
 ** A:StringBuffer的截取功能
	* public String substring(int start):
		* 从指定位置截取到末尾
	* public String substring(int start,int end):
		* 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
* B:注意事项
	* 注意:返回值类型不再是StringBuffer本身，是String

 */

/*
 * (StringBuffer和String的相互转换)
* A:String -- StringBuffer
	* a:通过构造方法
	* b:通过append()方法
* B:StringBuffer -- String
	* a:通过构造方法
	* b:通过toString()方法
	* c:通过subString(0,length);
 */
public class Demo3_StringBuffer_Method {
	public static void main(String[] args) {
//		demo1();
		
//		demo2();
		
		
	}

	private static void demo2() {
		//StringBuffer => String
		StringBuffer sb = new StringBuffer("dalton");
		
		//a.构造方法
		String s1 = new String(sb);
		//b.  toString()
		String s2 = sb.toString();
		//c.  subString(0,length) 
		String s3 = sb.substring(0, sb.length());
	}

	private static void demo1() {
		//String-=> StringBuffer
		//a.构造方法
		StringBuffer sb1 = new StringBuffer("dalton");
		System.out.println(sb1);
		//b.通过append方法
		StringBuffer sb2 = new StringBuffer();
		sb2.append("dalton");
		System.out.println(sb2);
	}
}
