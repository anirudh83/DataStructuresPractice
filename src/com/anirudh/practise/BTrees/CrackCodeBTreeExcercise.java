/**
 * 
 */
package com.anirudh.practise.BTrees;

/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 * 
 */
public class CrackCodeBTreeExcercise {
	
	/*
	 * Find max depth
	 */
	public int maxDepth(Node root){
		if(root==null)return 0;
		return 1+Math.max(maxDepth(root.getLeft()),maxDepth(root.getRight()));
	}

	public int minDepth(Node root){
		if(root==null)return 0;
		return 1+Math.min(maxDepth(root.getLeft()),maxDepth(root.getRight()));
	}
	/*
	 * 4.1 Implement a function to check if a tree is balanced For the purposes
	 * of this question, a balanced tree is defined to be a tree such that no
	 * two leaf nodes differ in distance from the root by more than one
	 */
	public boolean isBalanced(MyBTree btree) {

		return (maxDepth(btree.getRoot())-minDepth(btree.getRoot())<=1);

	}
	
	/*
	 * 4.2 Given a directed graph, 
	 * design an algorithm to find out whether there is a route between two nodes
	 * 
	 */
		

}
