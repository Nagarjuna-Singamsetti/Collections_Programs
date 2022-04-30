package com.Collections;

import java.util.Comparator;

public class MyComparator1 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = o1.toString();
		String str2 = o2.toString();
		return str2.compareTo(str1);
	}
}
