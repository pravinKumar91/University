package com.university.datastructure.doublylinkedlist;

public class DoublyLinkedList {
	
	Node head;
	
	public DoublyLinkedList insertAtLast(DoublyLinkedList list , int data) {
		Node node = list.head;
		Node newNode = Node.getInstance(data);
		if(node == null) {
			list.head = newNode;
		} else {
			while(node.next != null) {
				node = node.next;
			}
			node.next = newNode;
			newNode.prev = node;
		}
		return list;
	}

	public DoublyLinkedList insertAtStart(DoublyLinkedList list , int data) {
		Node node = list.head;
		Node newNode = Node.getInstance(data);
		if(node == null) {
			list.head = newNode;
		} else {
			newNode.next = node;
			node.prev = newNode;
			list.head = newNode;
		}
		return list;
	}
	
	public DoublyLinkedList removeFromLast(DoublyLinkedList list) {
		Node node = list.head;
		if(node==null) {
			System.out.println("Empty List");
		} else {
			while(node.next!=null) {
				node = node.next;
			}
			Node nodePrev = node.prev;
			nodePrev.next = null;
			node.prev = null;
		}
		return list;
	}
	
	public DoublyLinkedList removeFromStart(DoublyLinkedList list) {
		Node node = list.head;
		if(node==null) {
			System.out.println("Empty List");
		} else {
			Node head = node.next;
			head.prev = null;
			node.next = null;
			list.head = head;
		}
		return list;
	}
	
	public DoublyLinkedList removeData(DoublyLinkedList list, int data) {
		Node node = list.head;
		if(node==null) {
			System.out.println("Empty list");
		} else {
			while(node.data!=data) {
				node = node.next;
			}
			
			if(node.prev==null) {
				//removal from first node
				Node nodeNext = node.next;
				nodeNext.prev = null;
				node.next = null;
				list.head = nodeNext;				
			} else if(node.next==null) {
				//removal from last node
				Node nodePrev = node.prev;
				nodePrev.next = null;
				node.prev = null;
			} else {			
				//removal in between node
				Node nodePrev = node.prev;
				Node nodeNext = node.next;
				nodePrev.next = nodeNext;
				nodeNext.prev = nodePrev;			
				node.prev = null;
				node.next = null;
			}
		}
		return list;
	}
	
	public DoublyLinkedList reverseDoublyLinkedList(DoublyLinkedList list) {
		Node node = list.head;
		Node nodePrev = null;
		if(node==null) {
			System.out.println("Empty list");
		} else {
			while(node!=null) {
				Node currentNode = node.next;
				node.next = nodePrev;
				node.prev = currentNode;
				nodePrev = node;
				node = currentNode;
			}
			list.head = nodePrev;
		}
		return list;
	}
	
	public void print(DoublyLinkedList list) {
		Node node = list.head;
		if(node==null) {
			System.out.println("Empty List");
		} else {
			while(node!=null) {
				System.out.print(node.data+"->");
				node = node.next;
			}
			System.out.println("null");
		}
	}
}
