package com.geecat.steps.queue;

import com.geecat.steps.linkedlist.LinkedList;



public class QueueLinkedList<T> {

	LinkedList<T> list = new LinkedList<>();
	public void enQueue(T t) {
		list.addRear(t);
	}
	public T deQueue() {
		return list.getFront();
	}
	
	public int queueSize() {
		return list.getTotal();
	}
	
	public T front() {
		return list.Front();
	}
	
	public void printQueue() {
		list.printList();
	}
	
	/*LinkedList<Integer> list = new LinkedList<>();
	list.addRear(2);
	list.addRear(3);
	list.addRear(4);
	list.getFront();
	list.getFront();
	//list.getFront();
	//list.getFront();
	list.addRear(5);
	//list.getFront();
	list.printList();*/
}
