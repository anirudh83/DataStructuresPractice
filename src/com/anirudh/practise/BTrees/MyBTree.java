package com.anirudh.practise.BTrees;

import java.security.InvalidParameterException;

/**
 * 
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 * @param <T>
 */
public class MyBTree<T> {
	private Node<T> root = null;
	private int size;

	public MyBTree() {
	}
	
	public boolean addRoot(T element){
		if(root!=null){
			return false;
		}else{
			root = new Node<T>(element, null, null, null);
			size++;
			return true;
		}
		
	}
	
	/*
	 * Add an element to the left to the node passed as argument.
	 */
	public Node<T> addLeft(T element,Node<T> node){
		
		if(hasLeft(node)) throw new InvalidParameterException();
		else{
			Node<T> left = new Node<T>(element,node,null,null);
			node.setLeft(left);
			size++;
			return left;
		}
	}
	
	/**
	 * Add an element on right of Node
	 * @param element
	 * @param node
	 * @return
	 */
	public Node<T> addRight(T element ,Node<T> node){
		if(hasRight(node)) throw new InvalidParameterException();
		else{
			Node<T> right = new Node<T>(element,node,null,null);
			node.setRight(right);
			size++;
			return right;
		}
	}

	public boolean hasLeft(Node<T> node) {
		return node.getLeft() != null;
	}

	public boolean hasRight(Node<T> node) {
		return node.getRight() != null;
	}

	public Node<T> getLeft(Node<T> node) {
		return node.getLeft();
	}

	public Node<T> getRight(Node<T> node) {
		return node.getRight();
	}

	public void addElement(T element) {
		if (this.root == null) {
			root = new Node<T>(element,null,null,null);
		} else {
		}
	}

	public boolean exists(Node<T> node, T element) {

		boolean result=false;
		if (node.getElement().equals(element)) {
			return true;
		} else {
			if (node.hasLeft()&&!result) {
				result = exists(node.getLeft(), element);
			}

			if (node.hasRight()&&!result) {
				result = exists(node.getRight(), element);
			}
			return result;
		}
	}
	
	public Node<T> getRoot() {
		return root;
	}


	public void preOrder(Node<T> node) {
		visit(node);
		if (hasLeft(node)) {
			preOrder(node.getLeft());
		}
		if (hasRight(node)) {
			preOrder(node.getRight());
		}
	}
	
	public void inOrder(Node<T> node){
		if(hasLeft(node)){
            inOrder(node.getLeft());
		}
		visit(node);
		if(hasRight(node)){
            inOrder(node.getRight());
		}
	}
	
	public void postOrder(Node<T> node){
		if(hasLeft(node)){
			postOrder(node.getLeft());
		}
		if(hasRight(node)){
			postOrder(node.getRight());
		}
		visit(node);
	}

	
	
	private void visit(Node<T> node){
		System.out.print(node.getElement()+"-");
	}
	public int getSize() {
		return size;
	}

	public boolean isRoot(Node<T> node){
		return node==root;
	}
	
	public boolean isExternal(Node<T> node){
		if(node==null) return false;
		if(hasLeft(node)) return false;
		if(hasRight(node)) return false;
		return true;
	}
	
	public boolean isInternal(Node<T> node){
		if(node==null) return false;
		if(hasLeft(node)) return true;
		if(hasRight(node)) return true;
		return false;
	}
	
	public int depth(Node<T> node){
		if(isRoot(node)) return 0;
		return 1+depth(node.getParent());
	}
	
	public int height(Node<T> node) {
		if(node==null){
			return -1;
		}
		return 1+Math.max(height(node.getLeft()),height(node.getRight()));
		
	}
	
	public int getTreeHeight(){
		return height(root);
	}
}
