package com.geecat.steps.multithreaded;

public class One2Ten {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Print p = (Print) Class.forName("com.geecat.steps.multithreaded.Print").newInstance();//new Print();
		new PrintOdd(p);
		
		new PrintEven(p);
	}

}
class PrintOdd implements Runnable{
	Print print;
	PrintOdd(Print p){
		this.print=p;
		new Thread(this,"PrintOdd").start();
	}
	
	@Override
	public void run() {
		int i=1;
		while(i<=9){
			print.odd(i);
			i=i+2;
		}
		
	}
	
}

class PrintEven implements Runnable{
	Print print;
	public PrintEven(Print p) {
		this.print = p;
		new Thread(this,"Print Even").start();
	}
	
	@Override
	public void run() {
		int i=2;
		while(i<=10){
			print.even(i);
			i=i+2;
		}
		
	}
	
}
