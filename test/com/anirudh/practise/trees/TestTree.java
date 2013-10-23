package com.anirudh.practise.trees;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestTree {
	MyTree<String> tree;

	@Before
	public void init() {
		// root Element is set as root with parent Null
		tree = new MyTree<String>("root");
		TreeNode<String> root = tree.getRoot();
		TreeNode<String> node1 = root.addChild("second");
		root.addChild("third");
		root.addChild("fourth");
		node1.addChild("fifth");

	}

	@Test
	public void testPrintTreeAndDepth() {
		TreeNode<String> treeNodeToGet = prepareTree();
		assertEquals(2, tree.depth(treeNodeToGet));

	}

	private TreeNode<String> prepareTree() {
		TreeNode<String> treeNodeToGet = null;
		List<TreeNode<String>> children = tree.getRoot().getChildren();
		for (TreeNode<String> treeNode : children) {
			if (treeNode != null) {
				System.out.println(treeNode.getElement());
				List<TreeNode<String>> children2 = treeNode.getChildren();
				if (treeNode.getChildren() != null) {
					for (TreeNode<String> treeNode2 : children2) {
						if (treeNode2 != null) {
							System.out.println(treeNode2.getElement() + "("
									+ treeNode2.getParent().getElement() + ")");
							treeNodeToGet = treeNode2;
						}
					}
				}
			}
		}
		return treeNodeToGet;
	}
	
	@Test
	public void testHeightOfTree(){
		TreeNode<String> treeNodeToGet = prepareTree();
		assertEquals(0, tree.height(treeNodeToGet));
		assertEquals(2,tree.height(tree.getRoot()));
	}
	
	@Test
	public void testPreOrder(){
		System.out.println("----------PRE ORDER---------------");
		System.out.println(tree.preOrderTraversal(tree.getRoot()));
		System.out.println("------------------------------------");
	}
	
	@Test
	public void testPostOrder(){
		System.out.println("----------POST ORDER---------------");
		System.out.println(tree.postOrder(tree.getRoot()));
		System.out.println("------------------------------------");
	}

}
