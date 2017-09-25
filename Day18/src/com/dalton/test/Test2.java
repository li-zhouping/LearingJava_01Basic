package com.dalton.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌，牌没有排序
 * 
 */
public class Test2 {
public static void main(String[] args) {
	//买一副扑克
	String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] color = {"方片","梅花","红桃","黑桃"};
	ArrayList<String> poker = new ArrayList<>();
	
	for (String s1 : color) {
		for (String s2 : num) {
			poker.add(s1.concat(s2));     //concat()连续两个字符串
		}
		
	}
	poker.add("大王");
	poker.add("小王");
	
	//洗牌
	Collections.shuffle(poker);
	
	//发牌
	ArrayList<String> person1 = new ArrayList<>();
	ArrayList<String> person2 = new ArrayList<>();
	ArrayList<String> me = new ArrayList<>();
	ArrayList<String> dipai = new ArrayList<>();//留3张的底牌
	
	for (int i = 0 ; i < poker.size() ; i ++) {
		if (i >= poker.size() - 3 ) {//留3张作底牌
			dipai.add(poker.get(i));
		} else if (i % 3 == 0) {
			person1.add(poker.get(i));
		} else if (i % 3 == 1) {
			person2.add(poker.get(i));
		} else {
			me.add(poker.get(i));
		}
	}
	
	//看自己的牌
	System.out.println(me);
	System.out.println(me.size());
	System.out.println();
}
}
