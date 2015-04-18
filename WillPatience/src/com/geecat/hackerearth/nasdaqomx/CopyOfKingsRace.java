package com.geecat.hackerearth.nasdaqomx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class CopyOfKingsRace {
	public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        Integer p2[][] = null;
        int hurdle[] = null;
        for (int i = 0; i < N; i++) {
        	String[] s1 = br.readLine().split(" ");
        	p2= new Integer[Integer.parseInt(s1[0])][2];
        	hurdle = new int[Integer.parseInt(s1[1])];
        	s1 = br.readLine().split(" ");
        	for (int j = 0; j < s1.length; j++) {
        		p2[j][0]=Integer.parseInt(s1[j]);
        		p2[j][1]=j;
			}
        	s1 = br.readLine().split(" ");
        	for (int j = 0; j < s1.length; j++) {
				hurdle[j]=Integer.parseInt(s1[j]);
			}
        	
        	
        	Arrays.sort(hurdle);
        	Arrays.sort(p2, new Comparator<Integer[]>() {

				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					// TODO Auto-generated method stub
					/*if(o1[0]<o2[0]){
						return -1;
					}else if(o1[0]==o2[0]){
						return 0;
					}else{
						return 1;
					}*/
					return Integer.compare(o1[0], o2[0]);
				}
               
            });
            //Arrays are sorted in ascending order.
            for (int i1 = hurdle.length-1; i1 >=0; i1--) {
            	boolean win = false;
    			int temp = hurdle[i1];
    			int j=p2.length;
    			while(j>0){
    				//Prince p1 = princes[j-1];
    				if(temp<=p2[j-1][0]){
    					j--;
    					win=true;
    				}else{
    					break;
    				}
    			}
    			j=j+1;
    			if(win){
    				if(j==1){
    					System.out.println(0);
    					break;
    				}else{
    					int id=p2[j-1][1];
    					for(int k = j;k<p2.length;k++){
    						id=p2[k][1]<id?p2[k][1]:id;
        				}
    					System.out.println(id);
    					break;
    				}
    				
    			}
    			
    		}
            
        }
        
        
       // System.out.println("Hello World!");
    }
}

