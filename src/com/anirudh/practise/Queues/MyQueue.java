package com.anirudh.practise.Queues;

public interface MyQueue<T> {
	
	void enqueue(T t);
	T dequeue();
	boolean isEmpty();
	int size();

}
