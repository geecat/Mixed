package com.geecat.hackerearth.nasdaqomx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KingsRace {
	public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        //ArrayList<Prince> princes = null;
        Prince[] princes=null;
        Prince p=null;
        int hurdle[] = null;
        for (int i = 0; i < N; i++) {
        	String[] s1 = br.readLine().split(" ");
        	princes = new Prince[Integer.parseInt(s1[0])];//new ArrayList<Prince>(Integer.parseInt(s1[0]));
        	hurdle = new int[Integer.parseInt(s1[1])];
        	s1 = br.readLine().split(" ");
        	for (int j = 0; j < s1.length; j++) {
				p=new Prince(Integer.parseInt(s1[j]), j);
				princes[j]=p;
			}
        	s1 = br.readLine().split(" ");
        	for (int j = 0; j < s1.length; j++) {
				hurdle[j]=Integer.parseInt(s1[j]);
			}
        	
        	
        	Arrays.sort(hurdle);
            Arrays.sort(princes);
            //Arrays are sorted in reverse order.
            for (int i1 = hurdle.length-1; i1 >=0; i1--) {
            	boolean win = false;
    			int temp = hurdle[i1];
    			int j=princes.length;
    			while(j>0){
    				Prince p1 = princes[j-1];
    				if(temp<=p1.strength){
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
    					int id=princes[j-1].id;
    					for(int k = j;k<princes.length;k++){
    						id=princes[k].id<id?princes[k].id:id;
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

@SuppressWarnings("rawtypes")
class Prince implements Comparable{
	int strength;
	int id;
	
	public Prince(int a, int b){
		this.strength=a;
		this.id=b;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	
	@Override
	public int compareTo(Object o) {
		Prince otherPrice=(Prince)o;
		if(this.strength<otherPrice.strength){
			return -1;
		}else if(this.strength==otherPrice.strength){
			return 0;
		}else{
			return 1;
		}
	}

	
	
}
