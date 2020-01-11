package com.university.datastructure.singlylinkedlist;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>();
		ls.add("pravin");
		
		
		SinglyLinkedList list = new SinglyLinkedList();
		int data = 0;
		
		int[] dataArr = {2,5,8,2,4};
		
		for(int i = 0; i < 5; i++) {
			data = dataArr[i];
			System.out.println("inserting : "+data);
			list = SinglyLinkedList.insertNode(list, data);
		}
		
		SinglyLinkedList.printList(list);
		
		list = SinglyLinkedList.removeLast(list);
		SinglyLinkedList.printList(list);
		list = SinglyLinkedList.reverseList(list);
		SinglyLinkedList.printList(list);
		
		
		SinglyLinkedList.makeListAsCircular(list);
//		LinkedList.printList(list);
		
		SinglyLinkedList.circularList(list);
		
	}
}
