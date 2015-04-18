package com.geecat.awesome.april;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Findmode {
    public static void main(String args[] ) throws Exception {

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
            Arrays.sort(array, Collections.reverseOrder());
            int [] finalArray = new int[input];
            int countPrevious=0;
            int count = 0;
            
            finalArray[0] = array[0];
            int pre = array[0];
            countPrevious = 1;
            int index = 0;
          for (int j = 1; j < array.length; j++) {
			if(pre==array[j]){
				count++;
			}else{
				if (count>countPrevious) {
					finalArray = new int[input];
					index = 0;
					finalArray[index]=pre;
					pre=array[j];
					countPrevious=count;
					count = 1;
				}else if(count==countPrevious){
					finalArray[index+1]=pre;
					pre=array[j];
					count = 1;
					index++;
				}else{
					pre = array[j];
					count = 1;
				}
			}
		}
          for (int j = 0; j < index+1; j++) {
			if(finalArray[j]!=0){
				System.out.print(finalArray[j]+" ");
			}
			
		}
          System.out.println();
        }

    }
}
