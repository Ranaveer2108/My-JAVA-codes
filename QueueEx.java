package com.collection;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> que=new PriorityQueue<Integer>();
		que.add(24);
		que.add(15);
		que.add(56);
		que.poll();
		System.out.println(que);
		System.out.println(que.peek());
		Deque<Integer> dque=new ArrayDeque<Integer>();
		dque.push(26);
		dque.push(36);
		dque.push(6);
		dque.addFirst(1);
		dque.addLast(55);
		System.out.println(dque);
		System.out.println(dque.peek());
		System.out.println(dque.peekLast());
		System.out.println(dque.peekFirst());
	}

}
