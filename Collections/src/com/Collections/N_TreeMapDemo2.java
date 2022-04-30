package com.Collections;

import java.util.*;

public class N_TreeMapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> t = new TreeMap<>(new MyComparator1());//by comparator
		t.put("xxx", 10);
		t.put("aaa", 20);
		t.put("zzz", 30);
		t.put("DDD", 40);
		t.put("128", null);
		System.out.println(t);
	}
}
