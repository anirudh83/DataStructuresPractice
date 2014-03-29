/**
 * 
 */
package com.anirudh.practise.BST;

import com.anirudh.practise.BTrees.Node;

/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 * 
 */
public class BST {

	private Node<Integer> root;

	public void addElement(Node<Integer> node, Integer element) {
		
		
		if (node == null) {
			node = new Node<Integer>();
			node.setElement(element);
		} else if (node.getElement() < element) {
			addElement(node.getLeft(), element);
		} else if (node.getElement() > element) {
			addElement(node.getRight(), element);
		} else {
			node.setElement(element);
		}
	}

	public boolean exists(Node<Integer> node, Integer element) {
		
		if (node == null) {
			return false;
		}
		if (node.getElement() < element){
			return exists(node.getLeft(), element);
		}else if (node.getElement() > element) {
			return exists(node.getLeft(), element);
		}else{
			return false;
		}
	}

	public Node<Integer> getRoot() {
		return root;
	}

	public void setRoot(Node<Integer> root) {
		this.root = root;
	}
	
	

}
