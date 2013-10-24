package com.anirudh.practise.BTrees;

public class MyBTree<T> {
	Node<T> root = null;

	public MyBTree() {
	}

	public boolean hasLeft(Node<T> node) {
		return node.getLeft() == null;
	}

	public boolean hasRight(Node<T> node) {
		return node.getRight() == null;
	}

	public Node<T> getLeft(Node<T> node) {
		return node.getLeft();
	}

	public Node<T> getRight(Node<T> node) {
		return node.getRight();
	}

	public void addElement(T element) {
		if (this.root == null) {
			root = new Node<T>();
			root.setElement(element);
			root.setParent(null);
		} else {
		}
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public void preOrder(Node<T> node) {
		System.out.println(node);
		if (hasLeft(node)) {
			preOrder(node.getLeft());
		}
		if (hasRight(node)) {
			preOrder(node.getRight());
		}
	}

}
