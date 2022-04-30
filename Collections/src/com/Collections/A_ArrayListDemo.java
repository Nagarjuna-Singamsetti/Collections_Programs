package com.Collections;

import java.util.*;

public class A_ArrayListDemo {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("A");
		a.add("10");
		a.add("A");//Duplicates Allowed
		a.add(null);
		System.out.println(a);//Insertion Order Preserved
		a.remove(2);
		System.out.println(a);
		a.add(2, "C");
		System.out.println(a);
		a.add("D");
		a.set(0, "Software");
		a.add(0,"X");
		System.out.println(a);
		System.out.println(a.size());
		a.clear();
		System.out.println(a);
	}
}
