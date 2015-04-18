package com.geecat.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PowerSetOpt {

	private static BigInteger fact[] = new BigInteger[43];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        fillFact(42);
        for (int i = 0; i < N; i++) {
        	int num = Integer.parseInt(br.readLine());
        	int intSum = (num*(num+1))/2;
        	BigInteger sum = BigInteger.ZERO;
        	for (int j = 1; j <= num; j++) {
        		BigInteger x = (fact[num].divide((fact[j].multiply(fact[num-j]))));
        		x =x.multiply(BigInteger.valueOf(j));
        		x = x.divide(BigInteger.valueOf(num));
        		
        		sum = sum.add(x.multiply(BigInteger.valueOf(intSum)));
        						
			}
	        
	        System.out.println(sum);
		}
        
        
	}
	private static void fillFact(int i) {
		fact[0]=BigInteger.ONE;
		fact[1]=BigInteger.ONE;
		for (int j = 2; j <= i; j++) {
			fact[j] = fact[j-1].multiply(BigInteger.valueOf(j)); 
		}
	}
	
	
	
	

}
