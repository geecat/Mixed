package com.geecat.dynamic;

public class Fibonaci {

	static int number = 600;
	public static void main(String[] args) {
		//int number = this.number;
		long start  = System.currentTimeMillis();
		//long functionReturn = RecursiveFibonaci(number);
		//long functionReturn  = BUDPFibonaci(number);
		long functionReturn  = TDDPFibonaci(number);
		System.out.println("Time Taken: "+(System.currentTimeMillis()-start));
		System.out.println(functionReturn);

	}

	private static long RecursiveFibonaci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return RecursiveFibonaci(n - 1) + RecursiveFibonaci(n - 2);

	}
	static long BUDPFibonaci[] = new long[number];
	private static long BUDPFibonaci(int n){
		if(n==0||n==1)return 1;
		BUDPFibonaci[0]=1;
		BUDPFibonaci[1] = 1;
		for(int i=2;i<n;i++){
			BUDPFibonaci[i]=BUDPFibonaci[i-1]+BUDPFibonaci[i-2];
		}
		
		return BUDPFibonaci[n-1];
	}
	static long TDDPFibonaci[] = new long[number+1];
	private static long TDDPFibonaci(int n){
		if(n==1||n==2)return 1;
		if(TDDPFibonaci[n]!=0)return TDDPFibonaci[n];
		return TDDPFibonaci[n]=TDDPFibonaci(n-1)+TDDPFibonaci(n-2);
	}
}
