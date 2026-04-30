package com.rays.Collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		q.offer(60);

		System.out.println("q" + q);
		System.out.println("q : " + q.peek());

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

		System.out.println("q :" + q);

	}
}