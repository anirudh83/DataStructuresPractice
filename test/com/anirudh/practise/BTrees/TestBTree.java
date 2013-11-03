

package com.anirudh.practise.BTrees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class TestBTree {
	
	MyBTree<String> btree;
	
	@Before
	public void init(){
		btree = TreeFactory.constructImbalancedBTree();
	}
	@Test
	public void testCreateTree(){
		assertEquals(false,btree.addRoot("test"));
		assertEquals(true,btree.hasLeft(btree.getRoot()));
	}

	
	@Test
	public void testDisplay(){
		TreeFactory.displayBTree(btree.getRoot());
	}
	@Test
	public void testDepth(){
		assertEquals(2,btree.depth(TreeFactory.r3));
		assertEquals(3,btree.depth(TreeFactory.l4));
	}
	
	@Test
	public void testHeight(){
		assertEquals(3,btree.height(TreeFactory.r3));
		assertEquals(4,btree.height(TreeFactory.r1));
		assertEquals(1,btree.height(TreeFactory.r5));
	}
	
	@Test
	public void testPreOrder(){
		btree.preOrder(btree.getRoot());
		MyBTree<String> btree2 = TreeFactory.constructBalancedBTree();
		btree2.preOrder(btree2.getRoot());
	}
	
	@Test
	public void testPostOrder(){
		btree.postOrder(btree.getRoot());
		System.out.println("--------");
		MyBTree<String> btree2 = TreeFactory.constructBalancedBTree();
		btree2.postOrder(btree2.getRoot());
	}
	
	@Test
	public void testInOrder(){
		btree.inOrder(btree.getRoot());
		System.out.println("--------");
		MyBTree<String> btree2 = TreeFactory.constructBalancedBTree();
		btree2.inOrder(btree2.getRoot());
		
	}
	
	@Test
	public void testFindMax(){
		MyBTree<Integer> intTree = TreeFactory.condtructIntegerTree();
		int max = TreeAlgoExcercise.findMaximum(intTree.getRoot());
		System.out.println(max);
	}

}
