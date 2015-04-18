package com.geecat.steps.yantra;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			 int input = Integer.parseInt(br.readLine());
			 Integer array[] = new Integer[input];
	            String[] s1 = br.readLine().split(" ");
	            for (int j = 0; j < s1.length; j++) {
	            	array[j] = Integer.parseInt(s1[j]);
				}
	            
	            int query = Integer.parseInt(br.readLine());
	            for (int j = 0; j < query; j++) {
	            	s1 = br.readLine().split(" ");
	            	int x = Integer.parseInt(s1[1]);
	            	int y = Integer.parseInt(s1[0]);
	            	int review = -1;
	            	int move=y;
	            	while(true){
	            		
	            		move = array[move-1];
	            		review++;
	            		if(move==0&&x!=0){
	            			System.out.println(-1);
	            			break;
	            		}else{
	            			if(move==x){
		            			System.out.println(review);
			            		break;
		            		}
	            		}
	            		
	            	}
	            	
	            		
				}
	            
		}
	}
}
