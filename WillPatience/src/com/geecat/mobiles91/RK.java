package com.geecat.mobiles91;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RK {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			int n,m;
			n = Integer.parseInt(temp[0]);
			m = Integer.parseInt(temp[1]);
			line = br.readLine();
			
			Pattern pattern = Pattern.compile("Hello");
	        Matcher  matcher = pattern.matcher(line);
	        
	        
			
		}
	}
}
