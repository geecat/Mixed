package com.geecat.dynamic;

//Longest increasing subsequence
public class LIS {

	static int a[] = { 4, 5, 6, 2, 3, 4, 1, -4,-3,-2,-1,9, 9, 7,8, 5 };

	public static void main(String[] args) {
		System.out.println("Max increasing subsequence is : " + lis(a, 0,0));
	}

	private static int lis(int a[], int n,int lastMax) {

		int xFound = 0;
		int yNotFound = 0;
		int length = a.length ;
		if (length == 1) {
			return 1;
		}
		int count1 = 0;
		int lastMax1 = 0;
		int maxSoFar = 0;
		int maxCurrent = 0;
		for (int i = n; i < a.length; i++) {
			count1 = 0;
			for (int j = i; j< a.length; j++) {
				if (lastMax1 < a[j]) {
					lastMax1 = a[j];
					count1 = count1+1;
					
				}
			}
			if(count1>lastMax){
				lastMax = count1;
			}
			//xFound = lis(a, i+1,lastMax);
			
		}
		//maxCurrent = Math.max(xFound, yNotFound);
		
		return lastMax;
	}

}
