package com.university.datastructure.doublylinkedlist;

public class Node {
	
	int data;
	Node prev;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	public static Node getInstance(int data) {
		Node node = new Node(data);
		return node;
	}
}
