package com.dalton.stringbuffer;
/*
 * A:StringBuffer的添加功能
	* public StringBuffer append(String str):
		* 可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
	* public StringBuffer insert(int offset,String str):
		* 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
   B:StringBuffer的删除功能
	* public StringBuffer deleteCharAt(int index):
		* 删除指定位置的字符，并返回本身
	* public StringBuffer delete(int start,int end):
		* 删除从指定位置开始指定位置结束的内容，并返回本身
 */
public class Demo2_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		
		//添加
		sb.append("dalton");
		sb.append(true);
		sb.append(100);
		System.out.println(sb);
		
		sb.insert(6, "haha");
		System.out.println(sb);
		
		System.out.println("------------");
		
		//删除
		StringBuffer sb2 = new StringBuffer();
		sb2 = sb;              //其实没有意义，sb2和sb指向同一个对象。见行39
//		sb2.deleteCharAt(5);   //删除掉个索引的字符
		sb2.delete(6, 10);     //删除范围内的字符。删除时是包含头不包含尾
		System.out.println(sb2);
		
		sb2.delete(0, sb.length());
		System.out.println(sb2);
		System.out.println(sb);  //其实sb2和sb是同一个对象。
		//所以，不要用sb3 = newStringBuffer() 来清空缓冲区，原来的会变成垃圾浪费内存
		
		
		
	}

}
