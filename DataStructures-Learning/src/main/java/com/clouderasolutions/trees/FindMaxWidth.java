package com.clouderasolutions.trees;

public class FindMaxWidth {
	Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public int getMaxWidthOfBST(Node root) {
		int[] level = new int[getHeight(root)];
		findMaxWidthEachLevel(root, 0, level);
		int maxLevel = 0;
		return returnMaxFromArray(level, maxLevel);
	}

	private int returnMaxFromArray(int[] level, int maxLevel) {
		for (int j = 0; j < level.length; j++) {
			if (level[j] > maxLevel)
				maxLevel = level[j];
		}
		return maxLevel;
	}

	private void findMaxWidthEachLevel(Node root, int levelCount, int[] level) {
		if (root != null) {
			level[levelCount]++;
			findMaxWidthEachLevel(root.left, levelCount + 1, level);
			findMaxWidthEachLevel(root.right, levelCount + 1, level);
		}
	}

	private int getHeight(Node root) {
		if (root == null)
			return 0;
		else {
			int lHeight = getHeight(root.left);
			int rHeight = getHeight(root.right);

			return (lHeight > rHeight ? lHeight + 1 : rHeight + 1);
		}
	}

	public static void main(String[] args) {
		FindMaxWidth tree = new FindMaxWidth();

		/*
		 * Constructed bunary tree is: 1 / \ 2 3 / \ \ 4 5 8 / \ 6 7
		 */
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(8);
		tree.root.right.right.left = new Node(6);
		tree.root.right.right.right = new Node(7);

		System.out.println("Maximum width is " + tree.getMaxWidthOfBST(tree.root));
	}

}
