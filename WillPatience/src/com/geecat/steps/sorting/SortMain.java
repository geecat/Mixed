package com.geecat.steps.sorting;


public class SortMain {

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		
		int a1[] = {1,2,32,45,65,78,96,44,55,66,77,3,4,5,1,3,5};
		int a[] = {5,4,3,2,1,4};
		int a2[]={1,2,3,4,5};
		/*int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[1];
		}
		sum = sum/a.length;*/
		sort.quickSort(a,0,a.length-1);
		//Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
