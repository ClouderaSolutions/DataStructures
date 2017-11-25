package com.clouderasolutions.trees.tests;

import com.clouderasolutions.trees.FindLeftView;
import com.clouderasolutions.trees.Node;

import junit.framework.TestCase;

public class FindLeftViewTest extends TestCase {
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public void printLeftViewShouldReturnLeftViewOfTree() {
		FindLeftView tree = new FindLeftView();
		tree.root = new Node(12);
		tree.root.left = new Node(4);
		tree.root.right = new Node(18);
		tree.root.left.left = new Node(3);
		tree.root.right.right = new Node(20);
		tree.root.right.right.right = new Node(25);
		// assert statements
		assertEquals("12 18 20 25", tree.printLeftView());
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

}
