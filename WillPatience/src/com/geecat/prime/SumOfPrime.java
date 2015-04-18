package com.geecat.prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfPrime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int prime[] = new int[N];
		prime[0] = 2;
		int index = 1;
		int number = 3;
		int numSqrt = 0;
		boolean isPrime = true;
		while (number < N) {
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
			}
			isPrime = true;
			// increse the number by 2
			number = number + 2;

		}
		long sum = 0;
		if(N>2){
			for (int i = 0; i < N; i++) {
				sum = sum + prime[i];
			}
		}
		

		System.out.println(sum);

	}

	private static int squareRoot(long n) {
		return (int) Math.sqrt((double) n);
	}

}
