

package com.anirudh.practise.BTrees;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class TestBTree {
	
	MyBTree<String> btree;
	
	@Test
	public void testCreateTree(){
		init();
		assertEquals(false,btree.addRoot("test"));
		assertEquals(true,btree.hasLeft(btree.getRoot()));
	}

	private void init() {
		btree = new MyBTree<String>();
		btree.addRoot("root");
		Node<String> fLeft = btree.addLeft("fleft", btree.getRoot());
		Node<String> fRight = btree.addRight("fright", btree.getRoot());
		btree.addLeft("s1left", fLeft);
		btree.addRight("s2Right", fRight);
	}
	
	

}
