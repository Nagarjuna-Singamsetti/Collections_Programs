package com.Collections;

import java.util.Vector;

public class C_VectorDemo {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		System.out.println(v.capacity());
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.add("A");
		System.out.println(v);
		System.out.println(v.capacity());
		v.insertElementAt("X", 5);
		System.out.println(v);
		v.remove(5);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
		System.out.println(v.capacity());
	}
}