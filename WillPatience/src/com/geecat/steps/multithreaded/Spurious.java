package com.geecat.steps.multithreaded;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


	public class Spurious {
	    public static void main(String[] args) {
	        Lock lock = new ReentrantLock();
	        Condition cond = lock.newCondition();
	        lock.lock();
	        try {
	            try {
	                cond.await();
	                System.out.println("Spurious wakeup!");
	            } catch (InterruptedException ex) {
	                System.out.println("Just a regular interrupt.");
	            }
	        } finally {
	            lock.unlock();
	        }
	    	/*char c = 'c';
	    	short a = 'c';
	    	System.out.println(Type.class);*/
	    }
}
