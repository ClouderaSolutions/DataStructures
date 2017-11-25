package com.clouderasolutions.trees;

public class FindLeftView {

	public Node root;
	int maxLevel = 0;
	boolean initial = true;

	public void printLeftView() {
		 leftViewUsingRecursion(root, 1);
	}

	/*
	 * Go level order traversal, print first Node in every level, go from left to right
	 * 
	 * Time Complexity - O(n)
	 * 
	 * Using Recursion
	 */

	private void leftViewUsingRecursion(Node node, int currentLevel) {
		if (node == null)
			return;
		if (maxLevel < currentLevel) {
			System.out.print(" " + node.data);
			maxLevel = currentLevel;
		}

		leftViewUsingRecursion(node.left, currentLevel + 1);
		leftViewUsingRecursion(node.right, currentLevel + 1);
	}

	public static void main(String[] args) {
		FindLeftView tree = new FindLeftView();
		tree.root = new Node(12);
		tree.root.left = new Node(4);
		tree.root.right = new Node(18);
		tree.root.left.left = new Node(3);
		tree.root.right.right = new Node(20);
		tree.root.right.right.right = new Node(25);
		tree.printLeftView();
	}

}
