package com.clouderasolutions.trees;

public class LevelOrderInSpiralForm {
	static Node root;
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public void printLevelOrderInSpiralForm(Node node) {
		int height = getHeight(node);
		boolean altertnate = false;
		for (int i = 0; i <= height; i++) {
			printEachLevel(node, i, altertnate);
			altertnate = !altertnate;
		}
	}

	private void printEachLevel(Node node, int level, boolean altertnate) {
		if(node == null)
			return;
		if(level == 1)
			System.out.print(node.data + " ");
		else if(level >1) {
			if(altertnate==true) {
				printEachLevel(node.left, level-1, altertnate);
				printEachLevel(node.right, level-1, altertnate);
			}
			else {
				printEachLevel(node.right, level-1, altertnate);
				printEachLevel(node.left, level-1, altertnate);
			}
		}
	}

	private int getHeight(Node node) {
		if (node == null)
			return 0;
		else {
			int lHeight = getHeight(node.left);
			int rHeight = getHeight(node.right);
			return (lHeight > rHeight ? (lHeight + 1) : (rHeight + 1));
		}
	}

	public static void main(String[] args) {
		LevelOrderInSpiralForm tree = new LevelOrderInSpiralForm();
		tree.root = new Node(12);
		tree.root.left = new Node(4);
		tree.root.right = new Node(18);
		tree.root.left.left = new Node(3);
		tree.root.right.right = new Node(20);
		tree.root.right.right.right = new Node(25);
		tree.printLevelOrderInSpiralForm(tree.root);
	}
}