package com.geecat.hackerearth.macfee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Rooms {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line.trim());
	        
	        for (int i = 0; i < N; i++) {
	        	//ArrayList<Node> list = new ArrayList<Node>();
	        	int guest = Integer.parseInt(br.readLine().trim());
	        	String s1[] = br.readLine().split(" ");
	        	String s2[] = br.readLine().split(" ");
	        	Double l1 ;//= Double.parseDouble(br.readLine());
	        	Double l2;// = Double.parseDouble(br.readLine());
	        	//Double list[] = new Double[guest*2];
	        	Map<Double, Boolean> map = new TreeMap<Double, Boolean>();
	        	for (int j = 0; j < guest; j++) {
	        		l1 = Double.parseDouble(s1[j]);
	        		map.put(l1+0.1, true);
					l2 = Double.parseDouble(s2[j]);
					l2 = l1+l2;
					map.put(l2, false);
					
				}
	        	int max = 0;
	        	int current1 = 0;
	        	/*Set set2 = map.entrySet();
	            Iterator iterator2 = set2.iterator();
	            while(iterator2.hasNext()) {
	                 Map.Entry me2 = (Map.Entry)iterator2.next();
	                 if((boolean) me2.getValue()){
	                	 current1++;
	                 }else{
		        			current1--;
		        		}
		        		if(current1>max){
	        				max = current1;
	        			}
	            }*/
	            
	            for(Entry<Double, Boolean> entry : map.entrySet()) {
	            	  //String key = entry.getKey();
	            	  Boolean value = entry.getValue();
	            	  if(value){
		                	 current1++;
		                 }else{
			        			current1--;
			        		}
			        		if(current1>max){
		        				max = current1;
		        			}
	            	}
	        	
	        	/*for (int j = 0; j < arr1.length; j++) {
					if(arr2[j]==1.0){
						current1++;
						
					}else{
	        			current1--;
	        		}
	        		if(current1>max){
        				max = current1;
        			}
				}*/
	        	System.out.println(max);
	        }

	}
	
}
