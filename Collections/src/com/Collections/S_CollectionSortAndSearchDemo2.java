package com.Collections;

import java.util.*;

public class S_CollectionSortAndSearchDemo2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(15);
		l.add(0);
		l.add(5);
		l.add(20);
		l.add(10);
		System.out.println(l);// [15, 0, 5, 20, 10]
		Collections.sort(l, new MyComparator());
		System.out.println(l);// [20, 15, 10, 5, 0]
		System.out.println(Collections.binarySearch(l, 10, new MyComparator()));// 2
		System.out.println(Collections.binarySearch(l, 13, new MyComparator()));// -3
		System.out.println(Collections.binarySearch(l, 17));//-6(unpredictable)
	}
}
