package com.geecat.steps.queue;


public class QueueMain {

	public static void main(String[] args) {
		QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
		//Queue<Integer> queue = new Queue<Integer>(2);
		queue.enQueue(2);
		queue.deQueue();
		queue.enQueue(3);
		queue.enQueue(31);
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(4);
		queue.deQueue();
		queue.enQueue(41);
		queue.enQueue(43);
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(5);
		queue.enQueue(2);
		queue.deQueue();
		queue.enQueue(3);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(3);
		queue.printQueue();
		
		
	}

}
