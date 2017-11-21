package com.clouderasolutions.linkedlist;

import org.apache.log4j.Logger;

public class FindIntersectionInCircularList {
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
	
	public Node findIntersectionInCircularList(Node head) {
		Node slowPointer = head;
		Node fastPointer = head;
		while (fastPointer.next.next.data != slowPointer.next.data) {
			LOG.debug("SlowPointer Value : " + slowPointer);
			LOG.debug("fastPointer Value : " + fastPointer);
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			LOG.debug("SlowPointer Value : " + slowPointer);
			LOG.debug("fastPointer Value : " + fastPointer);
		}
		return slowPointer;
	}

	
	public static void main(String[] args) {
		LOG.info("Adding nodes to list");
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head.next;
		LOG.info("Calling findIntersectionInCircularList method");
		FindIntersectionInCircularList circularList = new FindIntersectionInCircularList();
		LOG.info(circularList.findIntersectionInCircularList(head).data);
	}
}