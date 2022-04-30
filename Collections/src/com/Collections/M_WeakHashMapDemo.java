package com.Collections;

import java.util.*;

public class M_WeakHashMapDemo {

	public static void main(String[] args) throws Exception {
		Map<Object, String> m = new WeakHashMap<>();
		Temp t = new Temp();
		m.put(t, "Durga");
		System.out.println(m);// {temp=Durga}
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}

}
