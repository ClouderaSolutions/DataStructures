package com.clouderasolutions.hackerrank.linkedlist;

public class ReverseLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node Reverse(Node head) {
		if (head == null || head.next == null)
			return head;
		Node newHead = Reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		Node headA = new Node(2);
		headA.next = new Node(6);
		headA.next.next = new Node(8);
		ReverseLinkedList linkedList = new ReverseLinkedList();
		Node newNode = linkedList.Reverse(headA);
		while (newNode != null) {
			System.out.println(newNode.data + " ");
			newNode = newNode.next;

		}
	}
}