package com.geecat.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class SmallFactorials {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	
            System.out.println(fact(Integer.parseInt(br.readLine())));
        }
        
    }
    
    private static BigInteger  fact(int  n){
    	BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
