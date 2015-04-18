package com.geecat.hackerearth.may;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LittleKuldeep {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		Integer start[] = new Integer[N];
		Integer end[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			temp = temp.replaceAll(":", "");
			String [] splited = temp.split("-");
			start[i]=Integer.parseInt(splited[0]);
			end[i]=Integer.parseInt(splited[1]);
		}
		boolean found  = false;
		for (int i = 0; i < start.length; i++) {
			int temp = start[i];
			
			for (int j = 0; j < end.length; j++) {
				if(j!=i&&temp<end[j]){
					
					if(temp>=start[j]){
						found=true;
					}
						
				}
			}
			
		}
		if(found){
			System.out.println("Will need a moderator!");
		}else{
			System.out.println("Who needs a moderator?");
		}
	}
}
