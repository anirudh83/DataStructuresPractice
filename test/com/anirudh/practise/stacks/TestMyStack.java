package com.anirudh.practise.stacks;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import com.anirudh.practise.stacks.MyStack;
import com.anirudh.practise.stacks.MyStackArrayImpl;
import com.anirudh.practise.stacks.MyStackArrayListImpl;
import com.anirudh.practise.stacks.MyStackLinkedListImpl;

public class TestMyStack {
	MyStackArrayListImpl<String> stackArrayList;
	MyStackLinkedListImpl<String> stackLinkedList;
	MyStackArrayImpl<String> stackArray;
	
	@Before
	public void init(){
		stackArrayList = new MyStackArrayListImpl<String>();
		stackLinkedList = new MyStackLinkedListImpl<String>();
		stackArray = new MyStackArrayImpl<String>();
	}

	@Test
	public void testMyStackArrayList(){
		testMyStack(stackArrayList);
	}
	
	@Test(expected=EmptyStackException.class)
	public void testExceptionStackArrayList(){
		stackArrayList.pop();
	}
	
	@Test(expected=EmptyStackException.class)
	public void testExceptionStackLinkedList(){
		stackLinkedList.pop();
	}
	
	@Test
	public void testStackLinkedList(){
		testMyStack(stackLinkedList);
	}
	
	@Test
	public void testStackArray(){
		testMyStack(stackArray);
	}
	
	@Test
	public void testResizeArray(){
		stackArray.push("1");
		stackArray.push("2");
		stackArray.push("3");
		stackArray.push("4");
		stackArray.push("5");
		stackArray.push("6");
		stackArray.push("7");
		assertEquals(10,stackArray.CAPACITY);
		stackArray.push("8");
		stackArray.push("9");
		stackArray.push("10");
		stackArray.push("11");
		stackArray.push("12");
		stackArray.push("13");
		assertEquals(13,stackArray.size());
		assertEquals(20,stackArray.CAPACITY);

		
	}
	
	private void testMyStack(MyStack<String> myStack) {
		myStack.push("First");
		myStack.push("second");
		myStack.push("third");
		assertEquals(3,myStack.size());
		assertEquals("third",myStack.pop());
		assertEquals("second",myStack.pop());
		assertEquals(false,myStack.isEmpty());
		assertEquals("First",myStack.pop());
		assertEquals(true,myStack.isEmpty());
	}
	
	//@Test
	public void sampleTest(){
		int a =7;
		int b = 10;
		System.out.println(a/b);
		System.out.println((double)a/b);
	}

}
