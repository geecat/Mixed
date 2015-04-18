package com.geecat.steps.yantra;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class StrangthOfNumber {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			 int input = Integer.parseInt(br.readLine());
			 Integer array[] = new Integer[input];
	            String[] s1 = br.readLine().split(" ");
	            int max=0;
	            for (int j = 0; j < s1.length; j++) {
	            	int temp = Integer.parseInt(s1[j]);
	            	array[j] = temp;
	            	if(temp>max)
	            		max=temp;
				}
	            
	            long sum = 0;
	            for (int j = 0; j < array.length-1; j++) {
					for (int j2 = j+1; j2 < array.length; j2++) {
						sum +=Math.abs(array[j]-array[j2]); 
					}
				}
	            
	            sum = sum*max;
	            sum = sum%1000000007;
	            System.out.println(sum);
		}
	}
}
