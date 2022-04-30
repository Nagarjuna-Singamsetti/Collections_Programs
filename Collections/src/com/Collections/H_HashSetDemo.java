package com.Collections;
import java.util.HashSet;
public class H_HashSetDemo {
	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<>();
		h.add("B");
		h.add("Q"); 
		h.add("J");
		h.add("Z");
		h.add(null);
		h.add(10);
		h.add("a");
		System.out.println(h.add("X"));
		System.out.println(h.add("Z"));// duplicates not allowed
		System.out.println(h);// Insertion order not preserved the output is based on hash code
								// [null, Q, a, B, X, J, Z, 10]
		h.remove("Q");
		System.out.println(h);
		System.out.println(h.add("Q"));
		System.out.println(h);
	}
}
