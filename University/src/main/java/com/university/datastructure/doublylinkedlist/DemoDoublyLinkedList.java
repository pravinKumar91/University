package com.university.datastructure.doublylinkedlist;

public class DemoDoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		int[] dataArr = {2,5,1,8,3,5};
		
		for(int i=0;i<dataArr.length;i++) {
			int data = dataArr[i];
			list = list.insertAtLast(list, data);
		}
		
		list.print(list);
		
		//now insert at start
		DoublyLinkedList list1 = list.insertAtStart(list, 9);
		list1.print(list1);
		
		//now remove from last
		DoublyLinkedList list2 = list.removeFromLast(list);
		list2.print(list2);
		
		//now remove from start
		DoublyLinkedList list3 = list.removeFromStart(list);
		list3.print(list3);
		
		//now remove data 8 from end
		DoublyLinkedList list4 = list.removeData(list,8);
		list4.print(list4);
		
		//now remove data 2 from start
		DoublyLinkedList list5 = list.removeData(list,2);
		list5.print(list5);
		
		//now reverse the list
		DoublyLinkedList list9 = list.reverseDoublyLinkedList(list);
		list9.print(list9);
		
		//now remove data 1 from in between
		DoublyLinkedList list10 = list.removeData(list,1);
		list10.print(list10);
	}
}
