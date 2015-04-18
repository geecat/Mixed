package com.geecat.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AmazingTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	
        	String s[] = br.readLine().split(" ");
        	int numStu = Integer.parseInt(s[0]);
        	int totalTime = Integer.parseInt(s[1]);
        	
        	s = br.readLine().split(" ");
        	int time[] = new int[s.length];
        	for (int j = 0; j < s.length; j++) {
				time[j] = Integer.parseInt(s[j]);
			}
        	Arrays.sort(time);
        	//Collections.re
        	int applied = 0;
        	int time1  = totalTime;
        	int time2 = totalTime;
        	for (int j = time.length-1; j >=0; j--) {
				
        		if(time1>time2){
        			time1 = time1-time[j];
        			applied++;
        		}else{
        				time2 = time2-time[j];
            			applied++;
        			
        		}
			}
        	
        	if (applied==numStu&&time1>=0&&time2>=0) {
				System.out.println("YES");
			}else{
					System.out.println("NO");
			}
        	
        }

	}

}
