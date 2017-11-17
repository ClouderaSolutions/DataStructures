package com.clouderasolutions.trees;

public class FindRightView {

	Node root;
	int maxLevel = 0;
	boolean initial = true;

	public void printRightView() {
		rightViewUsingRecursion(root, 1);
	}

	/*
	 * Go level order traversal, print first Node in every level, go from right to left
	 * 
	 * Time Complexity - O(n)
	 * 
	 * Using Recursion
	 */

	private void rightViewUsingRecursion(Node node, int currentLevel) {
		if (node == null)
			return;
		if (maxLevel < currentLevel) {
			System.out.print(" " + node.data);
			maxLevel = currentLevel;
		}

		rightViewUsingRecursion(node.right, currentLevel + 1);
		rightViewUsingRecursion(node.left, currentLevel + 1);
	}

	public static void main(String[] args) {
		FindRightView tree = new FindRightView();
		tree.root = new Node(12);
		tree.root.left = new Node(4);
		tree.root.right = new Node(18);
		tree.root.left.left = new Node(3);
		tree.root.right.right = new Node(20);
		tree.root.right.right.right = new Node(25);
		tree.printRightView();
	}

}
