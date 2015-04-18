package com.geecat.steps.linkedlist;

public class Link {

	int data;

	public Link(int n) {
		this.data = n;
		this.next=null;
		this.prev = null;
	}
	
	public Link(){
		this.next=null;
		this.prev = null;
	}

	Link next;
	Link prev;
}
