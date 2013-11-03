/**
 * 
 */
package com.anirudh.practise.BTrees;


/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class TreeFactory<T> {

	static MyBTree<String> btree;
	static MyBTree<Integer> intBTree;
    static Node<String> l1;
    static Node<String> r1;
	static Node<String> r3;
    static Node<String> l4;
    static Node<String> r5;
	
	public static MyBTree<String> constructImbalancedBTree(){
		    btree = new MyBTree<String>();
			btree.addRoot("root");
			l1 = btree.addLeft("l1", btree.getRoot());
			r1 = btree.addRight("r1", btree.getRoot());
			btree.addLeft("l2", l1);
			btree.addRight("r2",l1);
			btree.addLeft("l3",r1);
			r3 = btree.addRight("r3", r1);
			btree.addRight("r4",r3);
			l4 = btree.addLeft("l4",r3);
			btree.addLeft("l5", l4);
			r5 = btree.addRight("r5", l4);
			btree.addRight("r6",r5);
			return btree;
	}
	
	public static MyBTree<String> constructBalancedBTree(){
		btree = new MyBTree<String>();
		btree.addRoot("1");
		Node<String> node2 = btree.addLeft("2", btree.getRoot());
		Node<String> node3 = btree.addRight("3", btree.getRoot());
		btree.addLeft("4", node2);
		btree.addRight("5", node2);
		btree.addLeft("6", node3);
		btree.addRight("7", node3);
		return btree;
	}
	
	public static MyBTree<Integer> condtructIntegerTree(){
		intBTree = new MyBTree<Integer>();
		
		intBTree.addRoot(new Integer(1));
		Node<Integer> node2 = intBTree.addLeft(new Integer(2), intBTree.getRoot());
		Node<Integer> node3 = intBTree.addRight(new Integer(3), intBTree.getRoot());
		intBTree.addLeft(new Integer(4), node2);
		intBTree.addRight(new Integer(5), node2);
		intBTree.addLeft(new Integer(6), node3);
		intBTree.addRight(new Integer(7), node3);
		return intBTree;
	}
	public static void displayBTree(Node<String> node){
		System.out.println(node.getElement());
		if(node.hasLeft()) {
			displayBTree(node.getLeft());
		}
		if(node.hasRight()){
			displayBTree(node.getRight());
		}
		
	}
}
