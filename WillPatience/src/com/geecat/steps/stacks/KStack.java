package com.geecat.steps.stacks;

public class KStack {

	int[] arr;
	int[] top;
	int[] next;
	int free;
	int n, k;

	boolean isFull() {
		return (free == -1);
	}

	boolean isEmpty(int sn) {
		return (top[sn] == -1);
	}

	public KStack(int n, int k) {
		this.n = n;
		this.k = k;
		arr = new int[this.n];
		top = new int[this.k];
		next = new int[this.n];

		for (int i = 0; i < k; i++)
			top[i] = -1;

		// Initialize all spaces as free
		free = 0;
		for (int i = 0; i < n - 1; i++)
			next[i] = i + 1;
		next[n - 1] = -1; // -1 is used to indicate end of free list
	}

	
	public void push(int item, int sn)
	{
	    // Overflow check
	    if (isFull())
	    {
	        System.out.println("\nStack Overflow\n");
	        return;
	    }
	 
	    int i = free;      // Store index of first free slot
	 
	    // Update index of free slot to index of next slot in free list
	    free = next[i];
	 
	    // Update next of top and then top for stack number 'sn'
	    next[i] = top[sn];
	    top[sn] = i;
	 
	    // Put the item in array
	    arr[i] = item;
	}
	
	public int pop(int sn)
	{
	    // Underflow check
	    if (isEmpty(sn))
	    {
	         System.out.println("\nStack Underflow\n");
	         return Integer.MAX_VALUE;
	    }
	 
	 
	    // Find index of top item in stack number 'sn'
	    int i = top[sn];
	 
	    top[sn] = next[i];  // Change top to store next of previous top
	 
	    // Attach the previous top to the beginning of free list
	    next[i] = free;
	    free = i;
	 
	    // Return the previous top item
	    return arr[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3, n = 7;
		KStack ks = new KStack(n, k);
		ks.push(15, 2);
	    ks.push(45, 2);
	 
	    // Let us put some items in stack number 1
	    ks.push(17, 1);
	    ks.push(49, 1);
	    ks.push(39, 1);
	 
	    // Let us put some items in stack number 0
	    ks.push(11, 0);
	    /*ks.push(9, 0);
	    ks.push(7, 0);
	    ks.push(151, 2);
	    ks.push(451, 2);
	    
	    ks.push(111, 0);
	    ks.push(19, 0);
	    ks.push(117, 1);
	    ks.push(419, 1);
	    ks.push(319, 1);
	    ks.push(17, 0);*/
	    System.out.println(ks.pop(2));
	    ks.push(7, 0);
	    System.out.println(ks.pop(2));
	    ks.push(39, 1);
	    System.out.println(ks.pop(0));
	    ks.push(45, 2);
	    ks.push(11, 0);
	    System.out.println(ks.pop(1));
	    
	    System.out.println(ks.pop(2));
	    System.out.println(ks.pop(1));
	    System.out.println(ks.pop(0));
	}

}
