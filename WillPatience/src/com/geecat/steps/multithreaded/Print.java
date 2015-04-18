package com.geecat.steps.multithreaded;

public class Print {
	boolean isOdd = true;
	synchronized void odd(int n){
		while (!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Inturrept occured.");
			}
		}
		System.out.println("Odd: "+n);
		//this.even(n);
		//System.out.println(n);
		isOdd=false;
		notify();
	}
	
	synchronized void even(int n){
		while (isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Inturrept occured.");
			}
		}
		System.out.println("Even: "+n);
		//this.odd(n);
		//System.out.println(n);
		isOdd=true;
		notify();
	}
}