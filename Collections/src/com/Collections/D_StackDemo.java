package com.Collections;

import java.util.* ;

public class D_StackDemo {

	public static void main(String[] args) {
		Stack<Object> s = new Stack<Object>();
		System.out.println(s.empty());
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);
		System.out.println(s.search("C"));//returns offset from top of the stack
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		System.out.println(s.peek());// top of the stack
		System.out.println(s.empty());
		System.out.println(s.pop());// To remove and return top of stack
		System.out.println(s);
		System.out.println(s.search("C"));
	}
}
