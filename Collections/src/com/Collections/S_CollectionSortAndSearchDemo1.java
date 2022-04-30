package com.Collections;

import java.util.*;

public class S_CollectionSortAndSearchDemo1 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		System.out.println(l);// [Z, A, M, K, a]
		Collections.sort(l);
		System.out.println(l);// [A, K, M, Z, a]
		System.out.println(Collections.binarySearch(l, "Z"));// 3
		System.out.println(Collections.binarySearch(l, "J"));// -2
	}
}
