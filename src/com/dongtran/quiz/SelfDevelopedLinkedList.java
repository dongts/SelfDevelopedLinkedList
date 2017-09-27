package com.dongtran.quiz;

public class SelfDevelopedLinkedList {
	
	SelfDevelopedNode head;
	
	public void add(Integer value) {
		// Check if this is an empty Linked List => init it with head first
		if (head == null) {
			head = new SelfDevelopedNode(value);
			return;
		} 
		SelfDevelopedNode currentNode = head;
		// Loop to get the last node in the Linked List
		while (currentNode.hasNext()) {
			currentNode = currentNode.getNext();
		}
		// Add new node to be next item of the last node
		currentNode.setNext(new SelfDevelopedNode(value));
	}
	
	public void removeTail() {
		// No element to remove
		if (head == null) {
			System.out.println("Linked list is empty. No node to remove");
			return;
		}
		// There is only 1 element to remove
		if (!head.hasNext()) {
			head = null;
			return;
		}
		// For more than 2 elements to remove
		SelfDevelopedNode currentNode = head;
		while (currentNode.getNext().hasNext()) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(null);
		
	}
	
	public void removeAllGreaterThan(Integer targetValue) {
		// Loop through to make sure head is not the one to be removed
		while (head != null && head.getValue() > targetValue) {
			if (head.hasNext()) {
				head = head.getNext();
			} else {
				head = null;
			}
		}
		// Linked list is empty
		if (head == null) {
			return;
		}
		SelfDevelopedNode currentNode = head;
		while (currentNode.hasNext()) {
			if (currentNode.getNext().getValue() > targetValue) {
				if (currentNode.getNext().hasNext()) {
					currentNode.setNext(currentNode.getNext().getNext());
				} else {
					currentNode.setNext(null);
				}
			} else {
				currentNode = currentNode.getNext();
			}
		}
		
	}
	
	public void printAll() {
		if (head == null) {
			System.out.println("This linked list is empty");
			return;
		}
		SelfDevelopedNode currentNode = head;
		System.out.print(currentNode.getValue() + " ");
		while (currentNode.hasNext()) {
			currentNode = currentNode.getNext();
			System.out.print(currentNode.getValue() + " ");
		}
		System.out.println();
	}
}
