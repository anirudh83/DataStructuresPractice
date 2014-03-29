package com.anirudh.practise.BTrees;

/**
 * 
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 * 
 */
public class TreeAlgoExcercise {

	// Problem 1: Find Maximum

	public static int findMaximum(Node node) {
		if (node == null)
			return 0;
		return Math.max(
				(Integer) node.getElement(),
				Math.max(findMaximum(node.getLeft()),
						findMaximum(node.getRight())));
	}

	// Problem 2: search an element
	public boolean exists(Node node, Object element) {
		if (node == null) {
			return false;
		} else {
			if (node.getElement().equals(element)) {
				return true;
			} else {
				if (!exists(node.getLeft(), element)) {
					return exists(node.getRight(), element);
				}
			}
			return true;
		}
	}
	
	//Height of BTree :
	//number of nodes to be traversed in a path 
	//from the root to a leaf node
	//It could also be number of edges
	
	public int height(Node node){
		if(node==null){
			return -1;
		}
		return 1+Math.max(height(node.getLeft()),height(node.getRight()));
		
	}
	

	

	public int depth() {
		return 0;
	}

	public int height() {
		return 0;
	}

	public void evaluateExpression() {

	}

	public void preOrderTopostOrder() {

	}

	/**
	 * Find deepest node in the tree
	 */
	public Node findDeepestNode(MyBTree tree) {
		// TODO
		return null;
	}

}
