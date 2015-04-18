package com.geecat.egg;

public class EggDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(eggDrop(2, 100));
	}

	/* Function to get minimum number of trails needed in worst
	  case with n eggs and k floors */
	private static int eggDrop(int n, int k)
	{
	    // If there are no floors, then no trials needed. OR if there is
	    // one floor, one trial needed.
	    if (k == 1 || k == 0)
	        return k;
	 
	    // We need k trials for one egg and k floors
	    if (n == 1)
	        return k;
	 
	    int min = k, x, res;
	 
	    // Consider all droppings from 1st floor to kth floor and
	    // return the minimum of these values plus 1.
	    for (x = 1; x <= k; x++)
	    {
	        res = Math.max(eggDrop(n-1, x-1), eggDrop(n, k-x));
	        if (res < min)
	            min = res;
	    }
	 
	    return min + 1;
	}
	
	static void procA() throws IllegalAccessException{
		int a = 5;
		int b = 6;
		try{
			//int c = a/b;
		}catch(ArithmeticException e){
			throw new IllegalAccessException();
		}
		throw new RuntimeException();
		//throw new RuntimeException();
		//throw new Exception("Demo");
		//throw new IllegalAccessException();
		//throw new IllegalArgumentException("Demo");
		/*try{
			System.out.println("inside proca");
			//throw new RuntimeException("Demo");
			throw new IllegalArgumentException("Demo");
		}finally{
			System.out.println("inside finally");
		}*/
	}
}
