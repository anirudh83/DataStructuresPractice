package com.anirudh.practise.BTrees;

public class Node<T> {
	
	private T element;
	private Node<T> parent;
	private Node<T> left;
	private Node<T> right;
	
	public Node(T element,Node<T> parent,Node<T> left,Node<T>right) {
		setElement(element);
		setParent(parent);
		setLeft(left);
		setRight(right);
	}
	
	public Node(){
	}
	
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public Node<T> getParent() {
		return parent;
	}
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public Node<T> getRight() {
		return right;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
	
	public boolean hasLeft(){
		return left!=null;
	}
	
	public boolean hasRight(){
		return right!=null;
	}

}
