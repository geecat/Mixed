package com.geecat.steps.stacks;

public class Stackmain {

	public static void main(String[] args) {
		/*Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.printStack();
		Stack<String> stackString = new Stack<String>();
		stackString.push("one");
		stackString.push("two");
		stackString.printStack();
		System.out.println(stack.size());*/
		
		Stack<Integer> stackLimited = new Stack<Integer>();
		stackLimited.push(3);
		stackLimited.push(4);
		//stackLimited.pop();
		stackLimited.push(5);
		//stackLimited.pop();
		//stackLimited.pop();s
		stackLimited.push(5);
		stackLimited.push(6);
		//stackLimited.push(5);
		//stackLimited.push(6);
		//stackLimited.printStack();
		System.out.println(stackLimited.top());
	}

}
