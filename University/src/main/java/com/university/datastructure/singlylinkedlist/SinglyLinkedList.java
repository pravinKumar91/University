package com.university.datastructure.singlylinkedlist;

public class SinglyLinkedList {
	
	Node head;
	
	public SinglyLinkedList() {
	}
	
	public static SinglyLinkedList insertNode(SinglyLinkedList list, int data) {
		if(list.head==null) {
			list.head = Node.getInstance(data);
		} else {
			Node node = list.head;
			while(node.next!=null) {
				node = node.next;
			}
			node.next = Node.getInstance(data);
		}
		return list;
	}
	
	public static SinglyLinkedList makeListAsCircular(SinglyLinkedList list) {
		if(list.head==null) {
			System.out.println("Empty List");
		} else {
			Node head = list.head;
			Node fixHead = list.head;
			while(head.next!=null) {
				head = head.next;
			}
			head.next = fixHead;
		}
		return list;
	}
	
	public static SinglyLinkedList removeLast(SinglyLinkedList list) {
		if(list.head==null) {
			System.out.println("List is already Empty");
		} else {
			Node node = list.head;
			while(node.next.next!=null) {
				node = node.next;
			}
			node.next = null;
		}
		return list;
	}
	
	public void insertAt(SinglyLinkedList list, int data) {
		
	}
	
	public static SinglyLinkedList reverseList(SinglyLinkedList list) {
		if(list.head==null) {
			System.out.println("List is empty");
		} else {
			Node prev = null;
			Node current = list.head;
			Node next = null;
			while(current!=null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			list.head = prev;
		}
		return list;
	}
	
	public static SinglyLinkedList circularList(SinglyLinkedList list) {
		if(list.head==null) {
			System.out.println("List is empty and not circular");
		}  
		if(list.head.next==list.head) {
			System.out.println("Circular list found");
		} else {
			Node T = list.head;
			Node R = list.head.next;
			while(T!=R) {
				T = T.next;
				R = R.next.next;
			}
			System.out.println("Circular list found");
		}
		return list;
	}

	public static void printList(SinglyLinkedList list) {
		System.out.println();
		if(list.head==null) {
			System.out.println("List is empty");
		} else {
			Node node = list.head;
			while(node!=null) {
				System.out.print(node.value+"->");
				node = node.next;
			}
			System.out.println("null");
		}
	}
}
