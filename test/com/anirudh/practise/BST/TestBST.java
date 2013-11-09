/**
 * 
 */
package com.anirudh.practise.BST;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class TestBST {
	
	int arr[] ={ 2, -4, 21, 45, 5, 0, 32 };
	BST bst = new BST();

	@Test
	public void testCreateBST() {
		for(int i =0 ;i < arr.length;i++){
			bst.addElement(bst.root, arr[i]);
		}
	}

}
