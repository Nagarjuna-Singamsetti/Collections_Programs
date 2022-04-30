package com.Collections;

import java.util.*;

public class L_IdentityHashMapDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Map<Object, String> m = new IdentityHashMap<>();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "Pavan");
		m.put(I2, "Kalyan");
		System.out.println(m);
		//in IdentityHashMap compares by ==operator,where in HashMap comparison done by.equals()
		
		Map<Object, String> m1 = new HashMap<>();
		m1.put(I1, "Pavan");
		m1.put(I2, "Kalyan");
		System.out.println(m1);

	}
}
