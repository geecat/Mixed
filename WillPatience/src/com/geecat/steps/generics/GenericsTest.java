package com.geecat.steps.generics;

import java.util.ArrayList;

public class GenericsTest {

	public static void main(String[] args) {
	Generics<Integer> ob;
	
	ob = new Generics<Integer>(10);
	ob.showType();
	ob.getOb();
	
	Generics<String> ob1;
	ob1 = new Generics<String>("This is sparta");
	//This is raw taype of generics and it is not parametrized.
	//Generics raw = new Generics(new Integer(10));
	ob1.showType();
	ob1.getOb();
	ob.getOb();
	if(ob instanceof Generics<?>)
		System.out.println("True  "+ob1.getOb());
	
	System.out.println(ob.getClass().getName());

	}
//Generics<Integer> test[] = new Generics<Integer>[99];
}
