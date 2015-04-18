package com.geecat.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubString {
	 public static void main(String args[] ) throws Exception {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        String text;
	        String pattern;
	        int[] pat;
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	        	pat = new int[26];
	           text = br.readLine();
	           pattern = br.readLine();
	           char t[] = pattern.toCharArray();
	           int count = 0;
	           for (int j = 0; j < t.length&&count<27; j++) {
				
	        	   int index = t[j]-97;
	        	   if(pat[index]==0){
	        		   pat[index]=1;
	        		   count++;
	        	   }
			  }
	           boolean found = false;
	           t = text.toCharArray();
	           for (int j = 0; j < t.length; j++) {
	        	   int index = t[j]-97;
	        	   if(pat[index]==1){
	        		   found=true;
	        		   break;
	        	   }
			  }
	           if(found){
	        	   System.out.println("Yes");
	           }else{
	        	   System.out.println("No");
	           }
	        }

	    }
	}
