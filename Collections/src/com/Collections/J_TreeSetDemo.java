package com.Collections;

import java.util.*;

public class J_TreeSetDemo {

	public static void main(String[] args) {
		Set<Object> t = new TreeSet<>();
		t.add("A");
		t.add("X");
		t.add("C");
		t.add("Z");
		t.add("L");
		t.add("a");
		t.add("7");
		t.add("60Hi");
		t.add("Ajay");
		t.add("Ajax");
		// t.add(new Integer(10));//ClassCastException
		//t.add(null);//NullPointerException
		System.out.println(t);
	}
}
