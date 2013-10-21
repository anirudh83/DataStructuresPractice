package com.anirudh.practise.Queues;

/**
 * 
 * @author Anirudh
 * Queue = FIFO
 *
 * @param <T>
 */
public class MyQueueArrayImpl<T> implements MyQueue<T>{
	
	private T[] arr;
	private int counter;
	
	public MyQueueArrayImpl() {
		arr = (T[])new Object[10];
	}

	@Override
	public void enqueue(T t) {
		arr[counter++]=t;
		
	}

	/*
	 * Get first element from array
	 * (non-Javadoc)
	 * @see com.anirudh.practise.Queues.MyQueue#dequeue()
	 */
	@Override
	public T dequeue() {
		T temp = arr[0];
		for(int i=0;i<counter;i++){
			arr[i+1]=arr[i];
		}
		counter--;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return counter==0;
	}

	@Override
	public int size() {
		return counter;
	}
	
	

}
