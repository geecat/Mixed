package com.geecat.steps.linkedlist;

public class Node<T> {
private T data;
private Node<T> left;
private Node<T> right;
private Node<T> next;
private Node<T> back;
private Node<T> parent;
private Node<T> child;
private Node<T> sibling;

//default constructor//
public Node(){
	
}

//constructor initialized with data
public Node(T t){
	this.data = t;
}


public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}

public Node<T> getLeft() {
	return left;
}

public void setLeft(Node<T> left) {
	this.left = left;
}

public Node<T> getRight() {
	return right;
}

public void setRight(Node<T> right) {
	this.right = right;
}

public Node<T> getBack() {
	return back;
}

public void setBack(Node<T> back) {
	this.back = back;
}


public Node<T> getParent() {
	return parent;
}


public void setParent(Node<T> parent) {
	this.parent = parent;
}


public Node<T> getChild() {
	return child;
}


public void setChild(Node<T> child) {
	this.child = child;
}


public Node<T> getSibling() {
	return sibling;
}


public void setSibling(Node<T> sibling) {
	this.sibling = sibling;
}

public Node<T> getNext() {
	return next;
}

public void setNext(Node<T> next) {
	this.next = next;
}
}
