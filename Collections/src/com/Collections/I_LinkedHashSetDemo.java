package com.Collections;

import java.util.LinkedHashSet;

public class I_LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Object> h = new LinkedHashSet<>();
		h.add("B");
		h.add("Q");
		h.add("J");
		h.add("Z");
		h.add(null);
		h.add(10);
		h.add("a");
		System.out.println(h.add("X"));
		System.out.println(h.add("Z"));// duplicates not allowed
		System.out.println(h);// Insertion order preserved,the output is based on Insertion Order
								// [B, Q, J, Z, null, 10, a, X]
	}
}
