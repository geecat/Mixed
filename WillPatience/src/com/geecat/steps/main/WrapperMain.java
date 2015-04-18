package com.geecat.steps.main;

import java.util.ArrayList;
import java.util.List;

public class WrapperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b= new Boolean("True");
		Integer i1 = 1200;//new Integer(12);
		Integer i2 = 1200;//new Integer(12);
		int [] a = new int[10];
		int c = 0;
		List<Integer> int1 = new ArrayList<Integer>();
		int1.add(2);
		List an = int1;
		an.add("hello");
		for (Object object : an) {
			System.out.println(object);
		}
		/*if(i1.equals(i2)){
		//if(i1 == i2){
			System.out.println("You got me fucker!!");
		}else{
			System.out.println("Hard luck next time!!");
		}*/
	}

}
