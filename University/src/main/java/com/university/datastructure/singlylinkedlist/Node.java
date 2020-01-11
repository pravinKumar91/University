package com.university.datastructure.singlylinkedlist;

public class Node {
	
	int value;
	Node next;
	
	private Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	//Node class which will be act as Node object
	public static Node getInstance(int val) {
		Node node = new Node(val);
		return node;
	}
}
