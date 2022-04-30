package com.Collections;

import java.util.*;
import java.util.Map.Entry;

public class K_HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("Chiru", 700);
		m.put("Balaya", 800);
		m.put("Venki", 200);
		m.put("Nag", 500);
		System.out.println(m);// {Balaya=800, Nag=500, Chiru=700, Venki=200}//Based on HashCode
		System.out.println(m.put("Chiru", 1000));// 700//Returns Replaced value
		System.out.println(m);// {Balaya=800, Nag=500, Chiru=1000, Venki=200}

		Set<String> s = m.keySet();
		System.out.println(s);// [Balaya, Nag, Chiru, Venki]

		Collection<Integer> c = m.values();
		System.out.println(c);// [800, 500, 1000, 200]

		Set<Entry<String, Integer>> s1 = m.entrySet();
		System.out.println(s1);// [Balaya=800, Nag=500, Chiru=1000, Venki=200]

		Iterator<Entry<String, Integer>> itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>) itr.next();
			System.out.println(m1.getKey() + "---" + m1.getValue());
			if (m1.getKey().equals("Nag")) {
				m1.setValue(10000);
			}
		}
		System.out.println(m);// {Balaya=800, Nag=10000, Chiru=1000, Venki=200}

	}

}
