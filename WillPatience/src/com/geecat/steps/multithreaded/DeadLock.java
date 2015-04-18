package com.geecat.steps.multithreaded;

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();

	public DeadLock() {

		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "Racing Thread.");
		t.start();
		a.foo(b);

		System.out.println("Back in main thread.");
	}

	public void run() {

		b.bar(a);
		System.out.println("back iun other thread");
	}

	

}

class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " Entered A.foo");

		try {
			Thread.sleep(1000);
		} catch (Exception ex) {
			System.out.println("A interrupted");
		}
		System.out.println(name + " Trying to call B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("Inside A Last.");
	}
}

class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " Entered B.bar");

		try {
			Thread.sleep(1000);
		} catch (Exception ex) {
			System.out.println("B interrupted");
		}
		System.out.println(name + " Trying to call A.last()");
		a.last();
	}

	synchronized void last() {
		System.out.println("Inside B Last.");
	}
}
