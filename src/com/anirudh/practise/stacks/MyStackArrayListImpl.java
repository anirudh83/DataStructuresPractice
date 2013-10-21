package com.anirudh.practise.stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStackArrayListImpl<T> implements MyStack<T> {
	
	List<T> list = new ArrayList<T>();
	int currentIndex;
	
	public synchronized void push(T t){
		list.add(t);
		currentIndex++;
	}
	
	public synchronized T pop(){
		if(list.isEmpty()){
			throw new EmptyStackException();
		}else{
			return list.get(--currentIndex);
		}
	}

	@Override
	public int size() {
		//currentIndex get incremented after adding the element.
		return currentIndex;
	}

	@Override
	public boolean isEmpty() {
		return currentIndex == 0;
	}

}
