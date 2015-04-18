package com.geecat.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Mystery {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*String pat = "k! cats s*ack.";
		System.out.println(pat);
		Pattern pat1 = Pattern.compile("[^a-z*]");
		Matcher mat = pat1.matcher(pat);
		pat = mat.replaceAll("");
		System.out.println(pat.length());
		char[] c = pat.toCharArray();
		System.out.println(pat);
		//pat.replaceAll(pat1);
*/		
		 Pattern pat1 = Pattern.compile("[^a-z*]");
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	        	line = br.readLine();
	        	Matcher mat = pat1.matcher(line);
	        	line = mat.replaceAll("");
	        	int index = line.indexOf('*');
	        	int length = line.length();
	        	if(length%2==0){
	        		if(index>length/2){
		        		int diff = index-length/2;
		        		System.out.println(line.charAt(length/2-diff-1));
		        	}else{
		        		int diff = length/2-index;
		        		System.out.println(line.charAt(length/2+diff-1));
		        	}
	        	}else{
	        		if(index>(length)/2){
		        		int diff = index-(length)/2;
		        		System.out.println(line.charAt((length)/2-diff));
		        	}else{
		        		if(index+1==(length+1)/2){
		        			System.out.println('a');
		        		}
		        		int diff = (length)/2-index;
		        		System.out.println(line.charAt((length)/2+diff));
		        	}
	        	}
	        	
	            //System.out.println("hello world");
	        }
	}
	

}
