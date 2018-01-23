package com.clouderasolutions.linkedlist;

import java.util.Scanner;

public class SinglyLinkedList {

	public void removeLast(Node head) {
		if (head == null)
			System.out.println("List is empty");
		else {
			Node n1 = null;
			Node n2 = head;
			while (n2.next != null) {
				n1 = n2;
				n2 = n2.next;
			}
			n1.next = null;
		}
	}

	private Node removeNodesGreater(Node head, int x) {
		if (head == null)
			return head;

		if (head.data > x && head.next == null)
			return null;

		Node current = head;
		Node previous = null;

		while (current != null && current.data > x) {
			previous = current;
			current = current.next;
		}

		if (previous != null)
			previous.next = null;

		Node newList = current;

		while (current.next != null) {
			if (current.next.data > x) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return newList;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		Node list = new Node(5);
		list.next = new Node(15);
		list.next.next = new Node(25);
		list.next.next.next = new Node(3);
		list.next.next.next.next = new Node(14);
		SinglyLinkedList linkedList = new SinglyLinkedList();
		System.out.println("Printing List : ");
		linkedList.printList(list);
		System.out.println("");
		System.out.println("Removing Element from the last : ");
		linkedList.removeLast(list);
		System.out.println("Printing List : ");
		linkedList.printList(list);
		System.out.println("");
		System.out.println("Removing all elements from List after : ");
		@SuppressWarnings("resource")
		Node newList = linkedList.removeNodesGreater(list, new Scanner(System.in).nextInt());
		System.out.println("Printing new List : ");
		linkedList.printList(newList);
	}

}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return Integer.toString(data);
	}
}