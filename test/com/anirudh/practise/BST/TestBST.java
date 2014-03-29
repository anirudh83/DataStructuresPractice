/**
 * 
 */
package com.anirudh.practise.BST;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class TestBST {
	
	
	BST bst;
	
	@Before
	public void createBST() {
		int arr[] ={ 2, -4, 21, 45, 5, 0, 32 };
		bst = new BST();
		for(int i =0 ;i < arr.length;i++){
			bst.addElement(bst.getRoot(), arr[i]);
		}
	}

	@Test
	public void testExists(){
		assertFalse(bst.exists(bst.getRoot(), 4));
		assertTrue(bst.exists(bst.getRoot(), -4));
	}
}
