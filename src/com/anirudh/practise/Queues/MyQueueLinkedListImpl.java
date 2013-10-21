package com.anirudh.practise.Queues;

public class MyQueueLinkedListImpl<T> implements MyQueue<T> {
	
	private Node head = null;
	
	private class Node{
		T element;
		Node next;
	}

	@Override
	public void enqueue(T t) {
		Node temp = new Node();
		temp.element=t;
		temp.next=null;
		
		if(head==null){
			head=temp;
		}else{
			head.next=temp;
		}
		
	}

	@Override
	public T dequeue() {
		T element = head.element;
		head=head.next;
		return element;
	}

	@Override
	public boolean isEmpty() {
		return head==null;
	}

	@Override
	public int size() {
		int length = 0;
		Node temp=head;
		while(temp!=null){
			length++;
			temp=temp.next;
		}
		return length;
	}

}
