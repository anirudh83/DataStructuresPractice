package com.anirudh.practise.LinkedLists;

public class SingleLinkedList {

	Node head = null;

	private class Node {
		Object element;
		Node next;
	}

	public void addElementInFront(Object element) {
		Node newNode = new Node();
		newNode.element = element;
		newNode.next = head;
		head = newNode;
	}

	public void addElementFromEnd(Object element) {
		Node newNode = new Node();
		newNode.element = element;
		newNode.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public Node getNodeWithElement(Object element) {
		Node temp = head;
		while (temp.next != null) {
			if (temp.element.equals(element)) {
				return temp;
			} else {
				temp = temp.next;
			}
		}
		return null;
	}

	public boolean deleteNodeWithElement(Object element) {
		Node temp = head;
		//if first element
		if(temp.element.equals(element)){
			head=temp.next;
			temp=null;
			return true;
		}
		//this does not check for the first element
		while (temp.next != null) {
			if (temp.next.element.equals(element)) {
				Node toBeDeleted = temp.next;
				temp.next = toBeDeleted.next;
				toBeDeleted.next = null;
				toBeDeleted = null;
				return true;
			} else {
				temp = temp.next;
			}
		}
		return false;
	}

	public void reverse() {
		Node curr = head;
		Node prev = null;

		while (curr != null) {
			// next one node ahead of current
			Node next = curr.next;
			// Now the next Node to current is preserved, making current to
			// point to prev
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

	}

	public void displayLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.element + "->");
			temp = temp.next;
		}
	}

}
