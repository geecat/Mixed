package com.geecat.oo;

public class Interface3 implements Interface1,Interface2{

	public static void main(String[] args) {
		Interface3 i = new Interface3();
		i.eat();

	}

	@Override
	public void eat() {
		System.out.println("Hello are you kidding me.");
		
	}

}
