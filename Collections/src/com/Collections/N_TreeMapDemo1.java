package com.Collections;

import java.util.*;

public class N_TreeMapDemo1 {

	public static void main(String[] args) {
		Map<Object, Object> m = new TreeMap<>();//comparable
		m.put(103, "zzz");
		m.put(102, "yyy");
		m.put(101, "xxx");
		m.put(105, 106);
		m.put(104, null);
		//m.put("xyz", "zyx");//ClassCastException
		//m.put(null, "XYZ");//NullPointerException
		System.out.println(m);
	}
}