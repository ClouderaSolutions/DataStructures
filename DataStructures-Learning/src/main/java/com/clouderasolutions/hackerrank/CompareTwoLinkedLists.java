package com.clouderasolutions.hackerrank;

public class CompareTwoLinkedLists {
	
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	int CompareLists(Node headA, Node headB) {
		if(headA == null && headB != null || (headA != null && headB == null))
			return 0;
		if(headA == null && headB == null)
			 return 1;
		else {
			if(headA.data == headB.data)
			return CompareLists(headA.next, headB.next);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		CompareTwoLinkedLists compareTwoLinkedLists = new CompareTwoLinkedLists();
		Node headA = new Node(1);
		headA.next = new Node(2);
		Node headB = new Node(1);
		headB.next = new Node(2);
		headB.next.next = new Node(2);
		System.out.println(compareTwoLinkedLists.CompareLists(headA, headB));
	}
	
	
}
