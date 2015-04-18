package com.geecat.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PowerSet {

	private static BigInteger fact[] ;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
        	int num = Integer.parseInt(br.readLine());

        	 for (int i1 = 0; i1 < num; i1++) {
        		 list.add(i1+1);
        	 }
			
			
			List<List<Integer>> listPower = powerset(list);
	        
	        long sum = 0;

	        for (List<Integer> subset : listPower) {
	        	Iterator<Integer> it = subset.iterator();
	        	while (it.hasNext()) {
	        		Integer type = (Integer) it.next();
	        		sum = sum+type;
					
				}
	        }
	        
	        System.out.println(sum);
		}
        
        
	}
	
	
	
	public static  List<List<Integer>> powerset(Collection<Integer> list) {
		  List<List<Integer>> poserSet = new ArrayList<List<Integer>>();
		  poserSet.add(new ArrayList<Integer>());  
		 
		 
		  for (Integer item : list) {
		    List<List<Integer>> newPowerSet = new ArrayList<List<Integer>>();
		 
		    for (List<Integer> subset : poserSet) {
		      newPowerSet.add(subset);
		 
		      List<Integer> newSubset = new ArrayList<Integer>(subset);
		      newSubset.add(item);
		      newPowerSet.add(newSubset);
		    }
		 
		    poserSet = newPowerSet;
		  }
		  return poserSet;
		}
		 

}
