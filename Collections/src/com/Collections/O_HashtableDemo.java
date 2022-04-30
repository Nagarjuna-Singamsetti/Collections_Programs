package com.Collections;

import java.util.*;

//practical proof of hashcode
public class O_HashtableDemo {

	public static void main(String[] args) {
		Hashtable<Temp1, String> h = new Hashtable<>();
		h.put(new Temp1(5), "A");
		h.put(new Temp1(2), "B");
		h.put(new Temp1(6), "C");
		h.put(new Temp1(15), "D");
		h.put(new Temp1(23), "E");
		h.put(new Temp1(16), "F");
		// h.put("Durga", null);//NullPointerException
		System.out.println(h);

	}

}
