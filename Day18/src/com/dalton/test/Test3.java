package com.dalton.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * 模拟斗地主洗牌和发牌并对牌进行排序的代码实现
 */
public class Test3 {
	public static void main(String[] args) {
		//买一副牌
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"方片","梅花","红桃","黑桃"};
		HashMap<Integer, String> hm = new HashMap<>();			//存储索引和扑克牌
		ArrayList<Integer> list = new ArrayList<>();			//存储索引
		int index = 0;											//索引的开始值
		for(String s1 : num) {
			for(String s2 : color) {
				hm.put(index, s2.concat(s1));					//将索引和扑克牌添加到HashMap中
				list.add(index);								//将索引添加到ArrayList集合中
				index++;
			}
		}
		hm.put(index, "小王");
		list.add(index);
		index++;
		hm.put(index, "大王");
		list.add(index);
		
//		System.out.println(hm);
		
		//洗牌
		Collections.shuffle(list);
		
		//发牌
		TreeSet<Integer> person1 = new TreeSet<>();
		TreeSet<Integer> person2 = new TreeSet<>();
		TreeSet<Integer> me = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for (int i = 0; i < list.size() ; i++) {
			if (i >= list.size() - 3) {//留3张作底层
				dipai.add(list.get(i));
			} else if (i % 3 == 0) {
				person1.add(list.get(i));
			} else if (i % 3 == 1) {
				person2.add(list.get(i));
			} else {
				me.add(list.get(i));
			}
		}
		
		//看牌
		lookPoker("玩家一", person1, hm);
		lookPoker("玩家二", person2, hm);
		lookPoker("我", me, hm);
		lookPoker("底牌", dipai, hm);
		
		
	}

	private static void lookPoker(String name, TreeSet<Integer> ts,
			HashMap<Integer, String> hm) {
		System.out.println(name + "的牌是：");
		for (Integer index : ts) {
			System.out.print(hm.get(index) + " ");
		}
		System.out.println();
	}
	
}
