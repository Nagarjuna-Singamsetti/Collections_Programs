package com.Collections;

import java.util.*;

public class Q_PriorityQueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<Object> q = new PriorityQueue<>();
		System.out.println(q);// []
		// System.out.println(q.element());//java.util.NoSuchElementException
		// System.out.println(q.remove());//java.util.NoSuchElementException
		for (int i = 0; i <= 10; i++) {
			q.offer(i);
		}
		System.out.println(q);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(q.peek());// 0
		System.out.println(q.poll());// 0
		System.out.println(q);// [1, 3, 2, 7, 4, 5, 6, 10, 8, 9]
//Some Platforms wont provide proper support for thread priorities and priority queues
	}
}
