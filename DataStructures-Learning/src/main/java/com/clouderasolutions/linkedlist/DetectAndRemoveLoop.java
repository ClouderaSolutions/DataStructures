package com.clouderasolutions.linkedlist;

public class DetectAndRemoveLoop {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public boolean detectAndDeleteLoop(Node node) {
		Node slowPointer = node;
		Node fastPointer = node;

		while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;

			if (slowPointer == fastPointer) {
				removeLoop(slowPointer, node);
				return true;
			}
		}
		return false;
	}

	void removeLoop(Node loop, Node curr) {
		Node newNode = null, prevNode = null;
		newNode = curr;
		while (1 == 1) {
			prevNode = loop;
			while (prevNode.next != loop && prevNode.next != newNode) {
				prevNode = prevNode.next;
			}
			if (prevNode.next == newNode) {
				break;
			}
			newNode = newNode.next;
		}
		prevNode.next = null;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		DetectAndRemoveLoop detectAndRemoveLoop = new DetectAndRemoveLoop();
		detectAndRemoveLoop.head = new Node(50);
		detectAndRemoveLoop.head.next = new Node(20);
		detectAndRemoveLoop.head.next.next = new Node(15);
		detectAndRemoveLoop.head.next.next.next = new Node(4);
		detectAndRemoveLoop.head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = head.next.next;
		detectAndRemoveLoop.detectAndDeleteLoop(head);
		System.out.println("Linked List after removing loop : ");
		detectAndRemoveLoop.printList(head);
	}

}
