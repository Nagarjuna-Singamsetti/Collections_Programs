package com.Collections;
import java.util.Arrays;
public class T_ArraysSortDemo {
	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };
		System.out.println("Primitive Array before Sorting");
		for (int a1 : a) {
			System.out.println(a1);// 10,5,20,11,6
		}
		Arrays.sort(a);
		System.out.println("Primitive Array after Sorting");
		for (int a1 : a) {
			System.out.println(a1);// 5,6,10,11,20
		}
		String[] s = { "A", "Z", "B" };
		System.out.println("Object Array before Sorting");
		for (String s1 : s) {
			System.out.println(s1);// A,Z,B
		}
		Arrays.sort(s);
		System.out.println("Object Array after Sorting");
		for (String s1 : s) {
			System.out.println(s1);// A,B,Z
		}
		Arrays.sort(s, new MyComparator1());
		System.out.println("Object Array after Sorting by using Comparator");
		for (String s1 : s) {
			System.out.println(s1);//Z,B,A
		}
	}
}
