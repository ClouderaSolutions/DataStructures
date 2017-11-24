package com.clouderasolutions.hackerrank;


/*
 *
 * 

You’re given the pointer to the head nodes of two sorted linked lists. The data in both lists will be sorted in ascending order. Change the next pointers to obtain a single, merged linked list which also has data in ascending order. Either head pointer given may be null meaning that the corresponding list is empty.

Input Format 
You have to complete the Node* MergeLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two sorted linked lists to merge. You should NOT read any input from stdin/console.

Output Format 
Change the next pointer of individual nodes so that nodes from both lists are merged into a single list. Then return the head of this merged list. Do NOT print anything to stdout/console.

Sample Input

1 -> 3 -> 5 -> 6 -> NULL
2 -> 4 -> 7 -> NULL

15 -> NULL
12 -> NULL

NULL 
1 -> 2 -> NULL
Sample Output

1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> NULL
12 -> 15 -> NULL
1 -> 2 -> NULLFSS

 * 
 * 
 */


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
