package com.rays.Collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		Queue q = new PriorityQueue();

		q.add(10);
		q.add("Anish");

		System.out.println("q : " + q);

	}
}