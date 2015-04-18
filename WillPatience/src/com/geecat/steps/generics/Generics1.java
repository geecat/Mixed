package com.geecat.steps.generics;

public class Generics1<T> extends Generics<T>{

	//public Generics1(T o) {
	//	super(o);
		// TODO Auto-generated constructor stub
	//}

	T ob;
	public Generics1(T o) {
		super(o);
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
