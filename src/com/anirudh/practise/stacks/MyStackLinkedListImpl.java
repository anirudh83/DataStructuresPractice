package com.anirudh.practise.stacks;

import java.util.EmptyStackException;

public class MyStackLinkedListImpl<T> implements MyStack<T> {

	Node top;

	class Node {
		T element;
		Node next;
	}

	public MyStackLinkedListImpl() {
		top=null;
		
	}

	@Override
	public void push(T t) {
		Node temp = new Node();
		temp.element=t;
		temp.next=top;
		top=temp;
	}

	@Override
	public T pop() {
		if(top==null){
			throw new EmptyStackException();
		}else {
			T temp = top.element;
			top=top.next;
			return temp;
			
		}
	}

	@Override
	public int size() {
		int count = 0;
		Node temp=top;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		return top==null;
	}

}
