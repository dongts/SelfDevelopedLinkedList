package com.dongtran.quiz;

public class Main {

	public static void main(String[] args) {
		SelfDevelopedLinkedList linkedList = new SelfDevelopedLinkedList();
		linkedList.add(10);
		linkedList.printAll();
		linkedList.add(20);
		linkedList.add(40);
		linkedList.add(30);
		linkedList.printAll();
		linkedList.removeTail();
		linkedList.printAll();
		linkedList.removeAllGreaterThan(15);
		linkedList.printAll();
		linkedList.add(2);
		linkedList.add(5);
		linkedList.add(4);
		linkedList.add(3);
		linkedList.printAll();
		linkedList.removeAllGreaterThan(3);
		linkedList.printAll();
	}

}
