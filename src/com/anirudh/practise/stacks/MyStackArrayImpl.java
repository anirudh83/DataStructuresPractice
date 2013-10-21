package com.anirudh.practise.stacks;

import java.util.EmptyStackException;

public class MyStackArrayImpl<T> implements MyStack<T> {
	
	private T[] arr;
	private int index;
	protected int CAPACITY = 10;
	public double LOAD_FACTOR= 0.8;

	@Override
	public int size() {
		return index;
	}

	@Override
	public boolean isEmpty() {
		return index == 0;
	}

	@SuppressWarnings("unchecked")
	//Problem with Java, Java does not allow Generics in Array Creation
	public MyStackArrayImpl() {
		arr = (T[])new Object[CAPACITY];
	}
	@Override
	public void push(T t) {
		if(index >= CAPACITY){
			throw new StackOverflowError();
		}else{
			double cap = (double)index/CAPACITY;
			if(cap > LOAD_FACTOR){
				resize();
			}
			arr[index++]=t;
		}
		
	}

	@SuppressWarnings("unchecked")
	private void resize() {
		CAPACITY = CAPACITY * 2;
		Object[] tempArr = new Object[CAPACITY];
		for(int i = 0; i< index;i++){
			tempArr[i]=arr[i];
		}
		arr=(T[])tempArr;
	}

	@Override
	public T pop() {
		if(index<0){
			throw new EmptyStackException();
		}
		return (T)arr[--index];
	}
	
}
