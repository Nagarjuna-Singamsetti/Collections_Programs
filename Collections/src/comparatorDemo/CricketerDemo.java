package comparatorDemo;

import java.util.*;

public class CricketerDemo {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer("Sachin Tendulkar", "India", 200, 329, 15921, 248, 53.78);
		Cricketer c2 = new Cricketer("Ricky Pointing", "Australia", 168, 287, 13378, 257, 51.85);
		Cricketer c3 = new Cricketer("Jack Kallis", "South Africa", 166, 280, 13289, 224, 55.37);
		Cricketer c4 = new Cricketer("Rahul Dravid", "India", 164, 286, 13288, 270, 52.31);
		Cricketer c5 = new Cricketer("Alistar Cook", "England", 161, 291, 12472, 294, 45.25);
		System.out.println("HIGHEST RUNS SCORED");
		System.out.println("-------------------");
		Set<Object> t = new TreeSet<>();
		t.add(c2);
		t.add(c3);
		t.add(c5);
		t.add(c4);
		t.add(c1);
		Iterator<Object> i = t.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println();
		System.out.println("HIGHEST AVERAGE");
		System.out.println("---------------");
		Set<Object> t1 = new TreeSet<>(new MyComparator());
		t1.add(c2);
		t1.add(c3);
		t1.add(c5);
		t1.add(c4);
		t1.add(c1);
		Iterator<Object> i1 = t1.iterator();
		while (i1.hasNext())
			System.out.println(i1.next());
	}
}