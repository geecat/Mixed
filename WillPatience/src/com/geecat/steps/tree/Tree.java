package com.geecat.steps.tree;

public class Tree {
	
	private int data;
	private Tree left;
	private Tree right;
	
	public Tree() {
		// TODO Auto-generated constructor stub
	}
	
	public Tree(int a ,Tree left, Tree right) {
		// TODO Auto-generated constructor stub
		this.left=left;
		this.right=right;
		this.data = a;
	}
	
	public Tree(int a) {
		// TODO Auto-generated constructor stub
		this.data=a;
	}
	
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the left
	 */
	public Tree getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(Tree left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public Tree getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(Tree right) {
		this.right = right;
	}
}
