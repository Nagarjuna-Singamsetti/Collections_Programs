package com.Collections;
import java.util.*;

public class R_NavigableMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> t = new TreeMap<>();
		t.put("b", "boy");
		t.put("g", "gun");
		t.put("a", "apple");
		t.put("c", "cat");
		t.put("d", "dog");
		System.out.println(t);// {a=apple, b=boy, c=cat, d=dog, g=gun}
		System.out.println(t.ceilingKey("c"));// c
		System.out.println(t.higherKey("e"));// g
		System.out.println(t.floorKey("e"));// d
		System.out.println(t.lowerKey("a"));// null
		System.out.println(t.pollFirstEntry());// a=apple
		System.out.println(t.pollLastEntry());// g=gun
		System.out.println(t.descendingMap());// {d=dog, c=cat, b=boy}
		System.out.println(t);// {b=boy, c=cat, d=dog}
	}
}
