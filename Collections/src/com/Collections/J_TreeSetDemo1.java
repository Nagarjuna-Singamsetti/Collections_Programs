package com.Collections;

import java.util.*;

public class J_TreeSetDemo1 {

	public static void main(String[] args) {
		Set<Object> t = new TreeSet<>(new MyComparator());
		t.add(20);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(10);
		t.add(10);
		System.out.println(t);
	}

}