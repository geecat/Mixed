package com.geecat.hackerearth.septemberclash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LittleMontyandFibonacci {
	static BigInteger TDDPFibonaci[] =new BigInteger[1000];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        TDDPFibonaci(1000);
        for (int i = 0; i < N; i++) {
        	//long time = System.currentTimeMillis();
        	int numn = Integer.parseInt(br.readLine());
        	//TDDPFibonaci = new BigInteger[numn+1];
        	//TDDPFibonaci(numn);
        	long count = 0;
        	
        	for (int j = 0; j < numn; j++) {
        		BigInteger d = TDDPFibonaci[j];
        		BigInteger stop = TDDPFibonaci[numn-1].divide(BigInteger.valueOf(2));
        		
				int index=j;
				if (d.equals(BigInteger.ONE)) {
					count = count+numn;
				}else {
					//BigInteger d = TDDPFibonaci[j];
					count++;
					index++;
					if(index!=numn)
					while(d.compareTo(stop)<=0&&index<numn){
						if(TDDPFibonaci[index].mod(d).equals(BigInteger.ZERO)){
							count++;
							index++;
						}
						index++;
					}
				}
        		
			}
        	
        	
        	
        	System.out.println(count);
        	//System.out.println((System.currentTimeMillis()-time)/1000);
		}

	}
	
	 
	private static void TDDPFibonaci(int n){
		//long time = System.currentTimeMillis();
		TDDPFibonaci[0] = BigInteger.ONE;
		TDDPFibonaci[1] = BigInteger.ONE;
		for (int i = 2; i < n; i++) {
			TDDPFibonaci[i] = TDDPFibonaci[i-1].add(TDDPFibonaci[i-2]);
		}
		//System.out.println((System.currentTimeMillis()-time));
	}

}
