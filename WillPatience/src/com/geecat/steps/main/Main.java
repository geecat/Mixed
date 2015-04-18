package com.geecat.steps.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int position;
        int number;
        long count=1;
        for (int i = 0; i < N; i++) {
        		String in[] = br.readLine().split("");
        		position = Integer.parseInt(in[0]);
        		number = Integer.parseInt(in[1]);
        		
        		if(position==1){
        		count = 8*number;	
        		} else if(position==5){
        			count = number*8;
        			count = count+4;
        		}else{
        			int n = number/2;
        			if(number%2==0){
        				count = n*8;
        				count = count+position-1;
        			}else{
        				count = n*8;
        				count = count+5+(5-position-1);
        			}
        		}
        		
        }

        System.out.println(count);
    }
}
