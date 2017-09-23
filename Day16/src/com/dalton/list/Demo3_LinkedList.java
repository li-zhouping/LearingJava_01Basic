package com.dalton.list;

import java.util.LinkedList;

/*
* A:LinkedList类概述
* B:LinkedList类特有功能
	* public void addFirst(E e)及addLast(E e)
	* public E getFirst()及getLast()
	* public E removeFirst()及public E removeLast()
	* public E get(int index);
 */
public class Demo3_LinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		
		System.out.println(list);          //[d,c,b,a]
		
		list.addLast("e");
		
		System.out.println(list);          //[d,c,b,a,e]
		
		System.out.println(list.get(3));
	}
}
