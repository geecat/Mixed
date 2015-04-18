package com.geecat.steps.main;


public class MainPrint {

	static{
		System.out.println("In static section");
	}
	{
		System.out.println("In normal section");
	}
	
	public MainPrint(){
		System.out.println("in constructor.");
	}
	public static void main(String []args){
		
		MainPrint mp = new MainPrint();
	}
}
