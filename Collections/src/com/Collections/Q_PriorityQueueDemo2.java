package com.Collections;

import java.util.*;

public class Q_PriorityQueueDemo2 {

	public static void main(String[] args) {
		PriorityQueue<Object> q = new PriorityQueue<>(new MyComparator1());
		q.offer("C");
		q.offer("B");
		q.offer("E");
		q.offer("A");
		q.offer("D");
		System.out.println(q);// [E, D, C, A, B]
// Some Platforms wont provide proper support for thread priorities and priority queues
	}
}
