

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
	Node<String> fLeft;
	Node<String> fRight;
	Node<String> right2;
	Node<String> right3;
	
	
	@Test
	public void testCreateTree(){
		assertEquals(false,btree.addRoot("test"));
		assertEquals(true,btree.hasLeft(btree.getRoot()));
	}

	@Before
	public void init() {
		btree = new MyBTree<String>();
		btree.addRoot("root");
		fLeft = btree.addLeft("fleft", btree.getRoot());
		fRight = btree.addRight("fright", btree.getRoot());
		btree.addLeft("s1left", fLeft);
		right2 = btree.addRight("s2Right", fRight);
		Node<String> left3 = btree.addLeft("left3", right2);
		Node<String> left4 = btree.addLeft("left4", left3);
		btree.addLeft("left4right5", left4);
		right3 = btree.addRight("right3", right2);
		btree.addRight("right4", right3);
	}
	
	@Test
	public void testDepth(){
		assertEquals(2,btree.depth(right2));
		assertEquals(3,btree.depth(right3));
	}
	
	@Test
	public void testHeight(){
		assertEquals(3,btree.height(right2));
		assertEquals(4,btree.height(fRight));
	}

}
