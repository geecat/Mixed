package com.geecat.steps.generics;

public class Generics<T> {

	T ob;
	public Generics(T o) {

		this.ob=o;
	}
	T getOb(){
		System.out.println("Value : " +this.ob);
		return this.ob;
	}
	void showType(){
		System.out.println("Type of generics is : "+ob.getClass().getName());
	}
}
