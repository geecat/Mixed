package com.geecat.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class GotaCatchEmAll {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		Integer array[] = new Integer[N];
		String [] sInput = br.readLine().split(" ");
		for (int i = 0; i < sInput.length; i++) {
			array[i] = Integer.parseInt(sInput[i]);
		}
		
		//what test case are you missing.
		
		Arrays.sort(array,Collections.reverseOrder());
		int days=array[0]+1;
		int remain=days;
		for (int i = 1; i < array.length; i++) {
			if(remain>=array[i]+1){
				remain--;
			}else{
				int moreDays = array[i]+1-remain;
				days = days+moreDays;
				remain = remain+moreDays;
			}
		}
		System.out.println(days+1);
	}
}
