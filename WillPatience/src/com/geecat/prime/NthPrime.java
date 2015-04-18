package com.geecat.prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthPrime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int prime[] = new int[1000];
		prime[0] = 2;
		prime[1] = 3;
		//prime[3] = 5;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     String line = br.readLine();
	     int N = Integer.parseInt(line);
	    /* if(N==1){
	    	 System.out.println(2);
	     }if(N==2){
	    	 System.out.println(3);
	     }*/
	     int index = 2;
	     int number = 5;
	     int numSqrt = 0;
	     boolean isPrime = true;
	     while(index<=N-1){
	    		 numSqrt = squareRoot(number);
	    		 int temp = 0;
	    		 while(prime[temp]<=numSqrt){
	    			 if(number%prime[temp]==0){
	    				 //then its not a prime come out of this loop.
	    				 isPrime = false;
	    				 break;
	    			 }else{
	    				 temp++;
	    				
	    			 }
	    		 }
	    		 //increse the number by 2
	    		 if(isPrime){
	    			 prime[index]=number;
	    			 index++;
	    		 }
	    		 isPrime = true;
	    		 number = number+2;;
	    	 
	    	 
	     }
	     
	     System.out.println(prime[N-1]);
	     

	}
	
	
	private static int squareRoot(int n){
		return (int) Math.sqrt((double)n);
	}

}
