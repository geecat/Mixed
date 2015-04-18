package com.geecat.steps.queue;

import java.util.ArrayList;

public class Queue<T> {
	private int size = -1;
	private int total=0;;
	private int front;//it act as rear.
	private int rear;//it act as front.
	ArrayList<T> data = null;

	public Queue() {
		this.data = new ArrayList<T>();
		this.front = -1;
		this.rear = -1;
	}

	public Queue(int size) {
		this.data = new ArrayList<T>();
		this.size = size;
		this.front = -1;
		this.rear = -1;
	}

	public void enQueue(T t) {
		if (this.size != -1 && queueSize() == this.size) {
			System.out.println("Queue is full!!");
		} else {
			if (this.size != -1) {
				this.front = (this.front+1)%this.size;
				/*if(this.front==this.rear&&this.total!=0){
					System.out.println("Queue is full.");
				}else{*/
					this.data.add(front+1, t);
					this.total+=1;
				/*}*/
			} else {
				this.front += 1;
				this.total+=1;
				this.data.add(front, t);
				
			}

		}
	}

	public T deQueue() {
		T dt = null;
		if (queueSize() == 0) {
			System.out.println("Queue is empty");
		} else {
			if (this.size != -1) {
				this.rear = (this.rear+1)%this.size;
				/*if(this.front==this.rear&&this.total==0){
					System.out.println("Queue is Empty");
				}else{*/
					dt = this.data.remove(rear);
					this.total-=1;
				/*}*/
			} else {
				this.rear += 1;
				this.total-=1;
				dt = this.data.get(rear);
				
			}

		}
		return dt;

	}

	public T front() {
		T dt = null;
		if (queueSize() == 0) {
			System.out.println("Queue is empty");
		} else {
			dt = this.data.get(rear);
		}
		return dt;
	}

	public int queueSize() {
		//implement considering circular queue as well.
		return this.total;
	}

	public void printQueue() {

		System.out.println("Data in Queue is: ");
		if(this.rear<this.front){
			for (int i = rear+1; i < front+1; i++) {
				System.out.println(data.get(i));

			}
		}else{
			do {
				this.rear=(this.rear+1)%this.size;
				System.out.println(data.get(this.rear));
			} while (this.rear!=this.front);
		}
		
	}

}
