package com.Collections;
import java.util.*;
public class G_ListIteratorDemo {
	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		l.add("balakrishna");
		l.add("venky");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);// [balakrishna, venky, chiru, nag]
		ListIterator<String> ltr = l.listIterator();
		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("venki")) {
				ltr.remove();
			}
			if (s.equals("chiru")) {
				ltr.set("pawan");
			}
			if (s.equals("nag")) {
				ltr.add("chaitu");
			}
		}
		System.out.println(l);// [balakrishna, venky, pawan, nag, chaitu]
	}
}
