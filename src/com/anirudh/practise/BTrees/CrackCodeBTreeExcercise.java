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
		
	
	
	/*4.3 Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height
	 */
	
	
	
	/*
	44 Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth (i e , if you have a tree with depth D, you’ll have D linked lists)
	*/
	/* 45 Write an algorithm to find the ‘next’ node (i e , in-order successor) of a given node in a binary search tree where each node has a link to its parent
	 * */
	/* 46 Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree Avoid storing additional nodes in a data structure NOTE: This is not necessarily a binary search tree
	 * */ 
	/*47 You have two very large binary trees: T1, with millions of nodes, and T2, with hun- dreds of nodes Create an algorithm to decide if T2 is a subtree of T1
	48 You are given a binary tree in which each node contains a value Design an algorithm to print all paths which sum up to that value Note that it can be any path in the tree - it does not have to start at the root
	*/
	

}
