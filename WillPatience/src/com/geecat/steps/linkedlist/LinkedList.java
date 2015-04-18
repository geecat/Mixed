package com.geecat.steps.linkedlist;

public class LinkedList<T> {
	private Node<T> list;
	private Node<T> head;
	private int total=0;
	//private Node<T> temp;
	
	public void addRear(Node<T> node){
		if(list==null||head==null){
			this.list=node;
			this.head=node;
			this.total+=1;
		}else{
			this.list.setNext(node);
			this.list=node;
			this.total+=1;
		}
	}
	
	public void addRear(T data){
		Node<T> node = new Node<T>(data);
		if(list==null||head==null){
			this.list=node;
			this.head=node;
			this.total+=1;
		}else{
			this.list.setNext(node);
			this.list=node;
			this.total+=1;
		}
	}
	
	public T getFront(){
		T data = null;
		//now null is returned as we are not throwing any exception.
		if(head==null){
			System.out.println("List is empty.");
		}else{
			data = head.getData();
			this.total-=1;
			head = head.getNext();
		}
		return data;
	}
	public T Front(){
		T data = null;
		//now null is returned as we are not throwing any exception.
		if(head==null){
			System.out.println("List is empty.");
		}else{
			data = head.getData();
		}
		return data;
	}
	public int getTotal() {
		// TODO Auto-generated method stub
		return this.total;
	}
	
	public void printList(){
		Node<T> temp = head;
		while (temp!=null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
