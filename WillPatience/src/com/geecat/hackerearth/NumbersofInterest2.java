package com.geecat.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersofInterest2 {

	private static int f[] = new int[1000001];
	private static int g[] = new int[1000001];
	private static  int prime[] = new int[5000];
	private static int index = 1;
	private static int fnIndex = 2;
	private static int gnIndex = 2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
       prime[0] = 2;
        for (int i = 0; i < N; i++) {
        	int num = Integer.parseInt(br.readLine());
        	if(num>fnIndex){
        		fillFn(num);
            	fillGn(num);
        	}
        	
        	int an = (f[num]+g[num])%num;
        	System.out.println(an);
        }

	}
	private static void fillGn(int num) {
		g[0] = 0;
		g[1] = 0;
		for (int i = gnIndex; i <= num; i++) {
			g[i] = g[i-1]+ sumY(i);
		}
		
	}
	private static int sumY(int i) {

		int sum = 0;
		for (int j = 1; j < i; j++) {
			if(i%j==0){
				sum=sum+j;
			}
		}
		
		return sum;
	}
	private static void fillFn(int num) {
		f[0] = 0;
		f[1] = 0;
		for (int i = fnIndex; i <= num; i++) {
			f[i] = f[i-1]+smallestPrime(i);
		}
	}
	private static int smallestPrime(int i) {

		int primeNum = 0;
		int prIndex = 0;
		for (int j = 2; j <= i/2; j++) {
			if(prime[prIndex]==0){
				primeNum = getNextPrime(prIndex-1, j);
			}else{
				if(i%prime[prIndex]==0){
					return prime[prIndex];
				}else{
					prIndex++;
				}
			}
		}
		if(primeNum==0){
			primeNum = i;
		}
		return primeNum;
	}
	
	private static int getNextPrime(int primeNum, int n){
		boolean isPrime = true;
		int number = primeNum+1;
		int numSqrt = 0;
		while (number <= n) {
			numSqrt = squareRoot(number);
			int temp = 0;
			while (prime[temp] <= numSqrt) {
				if (number % prime[temp] == 0) {
					// then its not a prime come out of this loop.
					isPrime = false;
					break;
				} else {
					temp++;

				}
			}
			
			if (isPrime) {
				prime[index] = number;
				index++;
				return number;
			}
			// increse the number by 2
			number = number + 1;

		}
		return 0;
	}

	private static int squareRoot(long n) {
		return (int) Math.sqrt((double) n);
	}
}
