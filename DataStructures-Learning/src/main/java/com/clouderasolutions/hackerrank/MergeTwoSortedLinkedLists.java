package com.clouderasolutions.hackerrank;

public class MergeTwoSortedLinkedLists {
	
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node mergeLists(Node headA, Node headB) {
		if(headA == null)
			return headB;
		if(headB != null)	{
				if(headA.data < headB.data) {
					headA.next = mergeLists(headA.next, headB);
					return headA;
				}
			headB.next = mergeLists(headA, headB.next);
			return headB;
		}
	return headA;
	}
	
	public static void main(String[] args) {
		MergeTwoSortedLinkedLists sortedLinkedLists = new MergeTwoSortedLinkedLists();
		Node headA = new Node(2);
		headA.next = new Node(6);
		headA.next.next = new Node(8);
		
		Node headB = new Node(3);
		headB.next = new Node(7);
		headB.next.next = new Node(11);
		Node mergeList = sortedLinkedLists.mergeLists(headA, headB);
		while(mergeList!=null) {
			System.out.print(mergeList.data + " ");
			mergeList = mergeList.next;
		}
	}
}
