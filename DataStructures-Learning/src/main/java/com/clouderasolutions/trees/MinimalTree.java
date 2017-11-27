package com.clouderasolutions.trees;

/*
 * Minimal Tree: Given a sorted (increasing order) array 
 * with unique integer elements, write an 
 * algorithm to create a binary search tree 
 * with minimal height. 
 */

public class MinimalTree {
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	Node root = null;

	private void createMinimalTree(int[] sortedArray) {
		createMinimalTree(sortedArray, 0, sortedArray.length-1);
	}

	private Node createMinimalTree(int[] sortedArray, int start, int end) {
		if(start > end)
			return null;
		int mid = (start + end) / 2;
		Node node = new Node(sortedArray[mid]);
		node.left = createMinimalTree(sortedArray,start,mid-1);
		node.right = createMinimalTree(sortedArray, mid+1, end);
		return node;
	}

	public static void main(String[] args) {
		MinimalTree minimalTree = new MinimalTree();
		int[] sortedArray = { 2, 4, 5, 6, 8, 9, 12, 14, 16 };
		minimalTree.createMinimalTree(sortedArray);
	}

}