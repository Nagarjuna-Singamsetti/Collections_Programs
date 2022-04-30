package com.Collections;

import java.util.Arrays;

public class T_ArraysSortDemo1 {

	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };
		Arrays.sort(a);// Sort by Natural Order
		System.out.println(Arrays.binarySearch(a, 6));//1
		System.out.println(Arrays.binarySearch(a, 14));//-5
		String []s= {"A","Z","B"};
		Arrays.sort(s);// Sort by Natural Order
		System.out.println(Arrays.binarySearch(s, "Z"));//2
		System.out.println(Arrays.binarySearch(s, "S"));//-3
		Arrays.sort(s, new MyComparator1());
		System.out.println(Arrays.binarySearch(s, "Z",new MyComparator1()));//0
		System.out.println(Arrays.binarySearch(s, "S",new MyComparator1()));//-2
		System.out.println(Arrays.binarySearch(s, "N"));//-4(Unpredictable)
	}
}
