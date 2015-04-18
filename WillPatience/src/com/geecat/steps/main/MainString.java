package com.geecat.steps.main;

public class MainString {
	static char[] value = {'a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c','a','b','c'};
	static int hash = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ravi1234";
		String s1 = "ravi";
		System.out.println(s.hashCode()+" : "+s1.hashCode()+" : "+new MainString().hashCode());
		
		
	}
	
	 public  int hashCode() {
	        int h = hash;
	        if (h == 0 && value.length > 0) {
	            char val[] = value;

	            for (int i = 0; i < value.length; i++) {
	                h = 31 * h + val[i];
	            }
	            hash = h;
	        }
	        return h;
	    }

}
