package com.geecat.steps.linkedlist;

public class Reverse {

	public static void main(String[] args) {
		Link node = new Link();
		node.data = 1;
		Link temp2 = new Link(2);
		Link temp3 = new Link(3);
		Link temp4 = new Link(4);
		Link temp5 = new Link(5);
		node.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;

		Link temp = node;
		System.out.println("Printing original list");
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

		System.out.println("Printing reversed list");
		temp = reverse(node);

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	private static void alternateReverse() {

	}

	private static Link reverseBySize(Link node, int n) {

		if (node == null) {
			return null;
		}

		return node;

	}

	private static Link reverse(Link node) {

		if (node == null) {
			return null;
		}
		Link first = node;
		Link rest = node.next;
		if (rest == null) {
			return null;
		}
		// Node temp = node;
		// node = node.getNext();
		// node.setNext(reverse(temp));
		reverse(rest);
		rest.next = first;
		//first.next = null;
		node = rest;
		return node;
	}

}
