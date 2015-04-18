package com.geecat.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOdd {

	public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int R;
        int C;
        long odd = 0;
        long even = 0;
        for (int i = 0; i < N; i++) {
        	odd = 0;
        	even = 0;
        	String in[] = br.readLine().split(" ");
    		R = Integer.parseInt(in[0]);
    		C = Integer.parseInt(in[1]);
    		/*for (int j = 1; j <= R; j++) {
    			//for (int j1 = 1; j1 <= C; j1++) {
    				if(j%2==0){
    					if(j<=C){
    						even = even+j;
    					}else{
    						even = even+C;
    					}
    					
    				}else{
    					
    					if(j<=C){
    						odd = odd+j;
    					}else{
    						odd = odd+C;
    					}
    				}
    			//}
				
			}*/
    		
    		if(R<=C){
    			if(R%2==0){
    				even = sum(R);
    				odd = sum(R-1);
    			}else{
    				even = sum(R-1);
    				odd = sum(R);
    			}
    		}else{
    			if(C%2==0){
    				even = sum(C);
    				even = even+sumNormal(C+2, R, C);
    				odd = sum(C-1);
    				odd = odd+sumNormal(C+1, R, C);
    			}else{
    				even = sum(C-1);
    				even = even+sumNormal(C+1, R, C);
    				odd = sum(C);
    				odd = odd+sumNormal(C+2, R, C);
    			}
    			
    		}
    		
            System.out.println(even+" "+odd);
        }

    }
	
	public static long sum(int n){
		if(n<1)return 0;
		return n+sum(n-2);
	}
	public static long sumNormal(int n,int r,int c){
		if(n>r)return 0;
		return c+sumNormal(n+2,r,c);
	}
}
