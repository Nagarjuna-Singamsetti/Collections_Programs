package com.Collections;
import java.util.*;

public class B_LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<Object>();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		System.out.println(l);
		l.set(0, "Software");// replace the value at 0
		System.out.println(l);
		l.add(0, "Venky");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Hi");
		System.out.println(l);
		System.out.println(l.contains("durga"));
		System.out.println(l.contains("Hi"));
	}
}
