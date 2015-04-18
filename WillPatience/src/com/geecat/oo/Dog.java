package com.geecat.oo;

public class Dog extends Animal{

	public void print1(){
		System.out.println("Inside dog print.");
	}
	public static void main(String[] args) {

		
		Animal a = new Animal();
		Animal ad = new Dog();
		Animal d = new Dog();
		//a.eat();
		a.print();
		ad.print();
		d.print();
		
	}

}
