package com.clouderasolutions.hackerrank;

/*
 * 
 
You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. The lists are equal only if they have the same number of nodes and corresponding nodes contain the same data. Either head pointer given may be null meaning that the corresponding list is empty.

Input Format 
You have to complete the int CompareLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two linked lists to compare. You should NOT read any input from stdin/console.

Output Format 
Compare the two linked lists and return 1 if the lists are equal. Otherwise, return 0. Do NOT print anything to stdout/console.

Sample Input

NULL, 1 --> NULL 
1 --> 2 --> NULL, 1 --> 2 --> NULL

Sample Output

0
1
Explanation 
1. We compare an empty list with a list containing 1. They don't match, hence return 0. 
2. We have 2 similar lists. Hence return 1. 

 */

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
