package com.geecat.steps.main;

public class Every3Integer {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 2; i < 100; i=i+3) {
			System.out.println(i);
			if(i%2==0)
				sum +=i;
			
		}
		
		System.out.println("Sum: "+sum);

	}

}
