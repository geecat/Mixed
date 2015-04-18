package com.geecat.steps.queue;

public class QueueArray {
	private int size = -1;
	private int total = 0;;
	private int front;// it act as rear.
	private int rear;// it act as front.
	int[] data = null;

	public QueueArray(int s) {
		this.data = new int[s];
		this.size = s;
		this.front = -1;
		this.rear = -1;
	}

	public synchronized void add(int t) {
		while (isFull()) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Inturrept occured.");
			}
		}

		if (this.size != -1 && queueSize() == this.size) {
			System.out.println("Queue is full!!");
		} else {
			if (this.size != -1) {
				this.front = (this.front + 1) % this.size;
				this.data[front + 1] = t;
				this.total += 1;
			} else {
				this.front += 1;
				this.total += 1;
				this.data[front] = t;

			}

		}
		notifyAll();
	}

	public synchronized int remove() {

		while (isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Inturrept occured.");
			}
		}

		int dt = 0;
		if (queueSize() == 0) {
			System.out.println("Queue is empty");
		} else {
			if (this.size != -1) {
				this.rear = (this.rear + 1) % this.size;
				dt = this.data[rear];
				this.total -= 1;
			} else {
				this.rear += 1;
				this.total -= 1;
				dt = this.data[rear];

			}

		}
		notifyAll();
		return dt;

	}

	public int queueSize() {
		return this.total;
	}

	public boolean isEmpty() {
		return this.total <= 0;
	}

	public boolean isFull() {
		return this.total != this.size;
	}

}
