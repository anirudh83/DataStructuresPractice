package com.anirudh.practise.BTrees;


/**
 * 
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class TreeAlgoExcercise {
	
	public boolean isBalanced(MyBTree btree){
		
		
		return false;
		
	}
	
	public int depth(){
		return 0;
	}
	
	public int height(){
		return 0;
	}

	public void evaluateExpression(){
		
	}
	
	public void preOrderTopostOrder(){
		
	}
	
	/**
	 * For a tree having integers
	 * @return
	 */
	public static int findMaximum(Node node){
		int root_val=Integer.MIN_VALUE;
		int left=Integer.MIN_VALUE;
		int right=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		
		root_val = (int) node.getElement();
		if(node.hasLeft())
		left = findMaximum(node.getLeft());
		if(node.hasRight())
		right = findMaximum(node.getRight());
		max = (left > right) ? left : right;
		if(root_val>max) max= root_val;
		return max;
		
	}
}
