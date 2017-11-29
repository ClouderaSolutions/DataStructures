package com.clouderasolutions.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List of Depths: Given a binary tree, 
 * design an algorithm which creates a linked list of all the nodes 
 * at each depth 
 * (e.g., if you have a tree with depth D, you'll have D linked lists). 
 */
public class ListOfDepths {
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	LinkedList<Node> eachList = new LinkedList<>();
	ArrayList<LinkedList<Node>> total = new ArrayList<LinkedList<Node>>();
	
	public void createListOfDepths(Node node) {
		createLinkedLists(node, total, 0);
	}

	public void createLinkedLists(Node root, ArrayList<LinkedList<Node>> lists, int currentLevel) {
		if (root == null)
			return;
		LinkedList<Node> list = null;
		if (lists.size() == currentLevel) {
			list = new LinkedList<Node>();
			lists.add(list);
		} else
			list = lists.get(currentLevel);
		list.add(root);
		createLinkedLists(root.left, lists, currentLevel + 1);
		createLinkedLists(root.right, lists, currentLevel + 1);
	}

}
