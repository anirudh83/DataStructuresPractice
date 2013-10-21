package com.anirudh.practise.LinkedLists;

import org.junit.Test;

public class TestLinkedList {
	
	SingleLinkedList sll = new SingleLinkedList();

	@Test
	public void test() {
		sll.addElementInFront("2");
		sll.addElementInFront("1");
		sll.addElementFromEnd("3");
		sll.addElementFromEnd("4");
		sll.addElementInFront("0");
		sll.displayLinkedList();
		System.out.println("Delting node with element 0");
		sll.deleteNodeWithElement("0");
		sll.displayLinkedList();
		System.out.println("Reversing The linked list");
		sll.reverse();
		sll.displayLinkedList();
		
	}

}
