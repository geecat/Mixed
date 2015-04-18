package com.geecat.hackerearth.septemberclash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GlowingBulbs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int prime[] ;
        int p = 0;
        long howMany = 0;
        for (int i = 0; i < N; i++) {
        	prime = new int[12];
        	p = 0;
        	char[] in = br.readLine().toCharArray();
        	for (int j = 0; j < in.length; j++) {
				if(in[j]=='1'){
					prime[p]=j+1;
					p++;
				}
				
			}
        	howMany = Long.parseLong(br.readLine());
        	
        	long count = 0;
        	long number = prime[0];
        	if(p==1){
        	 number = count*number;
        	}else{
        		while(count<howMany){
            		
            		for (int j = 0; j < p; j++) {
    				 if(number%prime[j]==0){
    					 count++;
    					 //number++;
    					 break;
    				 }
    				
    				}
            		 number++;
            	}
        	}
        	
        	System.out.println(number-1);
        	
        }

	}

}
