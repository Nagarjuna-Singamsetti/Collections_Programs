package com.Collections;

import java.util.*;
import java.util.Map.Entry;

public class K_LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> m = new LinkedHashMap<>();
		m.put("Chiru", 700);
		m.put("Balaya", 800);
		m.put("Venki", 200);
		m.put("Nag", 500);
		System.out.println(m);//{Chiru=1000, Balaya=800, Venki=200, Nag=500} //Based on Insertion Order
		System.out.println(m.put("Chiru", 1000));// 700//Returns Replaced value
		System.out.println(m);// {Chiru=1000, Balaya=800, Venki=200, Nag=500}

		Set<String> s = m.keySet();
		System.out.println(s);// [Chiru, Balaya, Venki, Nag]

		Collection<Integer> c = m.values();
		System.out.println(c);// [1000, 800, 200, 500]

		Set<Entry<String, Integer>> s1 = m.entrySet();
		System.out.println(s1);// [Chiru=1000, Balaya=800, Venki=200, Nag=500]

		Iterator<Entry<String, Integer>> itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>) itr.next();
			System.out.println(m1.getKey() + "---" + m1.getValue());
			if (m1.getKey().equals("Nag")) {
				m1.setValue(10000);
			}
		}
		System.out.println(m);// {Chiru=1000, Balaya=800, Venki=200, Nag=10000}
	}
}
