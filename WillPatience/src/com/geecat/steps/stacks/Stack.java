package com.geecat.steps.stacks;

import java.util.ArrayList;
/**
 * This is generic implementation of stack class.
 * use this for all your implementation going forward.
 * @author Geecat
 *
 * @param <T>
 */
public class Stack<T> {
	private int tos = 0;
	private int limitedStack=-1;
	ArrayList<T> data = null;

	public Stack() {
		this.data = new ArrayList<T>();

	}
	public Stack(int size) {
		this.limitedStack = size;
		this.data = new ArrayList<T>();
	}

	// implement me please and that too with generics.
	public void push(T t) {
		if(limitedStack!=-1&&limitedStack==tos){
			System.out.println("Stack is full.");//letter throw exception.
		}else{
			this.data.add(tos, t);/*add(t);*/
			this.tos += 1;
		}
	}

	public T pop() {
		
		T dt;
		if (tos == 0) {
			// throw an exception later as of now just log.
			System.out.println("Stack is empty.");
			dt = null;
		} else {
			dt = this.data.get(tos-1);
			this.tos -= 1;
		}
		return dt;

	}

	public T top() {
		T dt;
		if (tos == 0) {
			// throw an exception later as of now just log.
			System.out.println("Stack is empty.");
			dt = null;
		} else {
			dt = this.data.get(tos-1);
		}
		return dt;
	}

	public int size() {
		return this.data.size();// tos+1;
	}
	
	public void printStack() {
		System.out.println("Data in stack is: ");
		for (int i =tos-1 ;i>-1;i--) {
			System.out.println(data.get(i));
			
		}
	}

	/**
	 * This are all the test thing.
	 */
	/*Stack<Integer> stack = new Stack<Integer>();
	stack.push(1);
	stack.push(2);
	stack.printStack();
	Stack<String> stackString = new Stack<String>();
	stackString.push("one");
	stackString.push("two");
	stackString.printStack();
	System.out.println(stack.size());*/
	
	/*Stack<Integer> stackLimited = new Stack<Integer>(2);
	stackLimited.push(3);
	stackLimited.push(4);
	stackLimited.push(5);
	stackLimited.push(6);
	stackLimited.printStack();
	Stack<String> stackString = new Stack<String>();
	stackString.printStack();
	stackString.pop();*/
	
	/*Stack<Integer> stackLimited = new Stack<Integer>(2);
	stackLimited.push(3);
	stackLimited.push(4);
	stackLimited.pop();
	stackLimited.push(5);
	stackLimited.pop();
	stackLimited.pop();
	stackLimited.push(5);
	stackLimited.push(6);
	//stackLimited.push(5);
	//stackLimited.push(6);
	stackLimited.printStack();
	System.out.println(stackLimited.top());*/
}
