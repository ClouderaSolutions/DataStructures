package com.clouderasolutions.linkedlist;

import org.apache.log4j.Logger;

public class FindMiddleNode {

	static final Logger LOG = Logger.getLogger(FindMiddleNode.class);

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {

			return Integer.toString(data);
		}
	}

	public Node findMiddleNode(Node head) {
		Node slowPointer = head;
		Node fastPointer = head;

		while (fastPointer.next != null) {
			LOG.debug("SlowPointer Value : " + slowPointer);
			LOG.debug("fastPointer Value : " + fastPointer);
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}

		return slowPointer;
	}

	public static void main(String[] args) {
		LOG.info("Adding nodes to list");
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next = new Node(4);

		LOG.info("Calling findMiddleNode method");
		FindMiddleNode findMiddleNode = new FindMiddleNode();

		LOG.info(findMiddleNode.findMiddleNode(head));
	}

}

