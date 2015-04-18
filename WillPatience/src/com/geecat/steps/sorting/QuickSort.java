package com.geecat.steps.sorting;

public class QuickSort {

	public void quickSort(int a[],int low,int high){
		int pivot;
		if(high>low){
			pivot=partition1(a,low,high);
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
		}
		
	}
	
	
	public int partition1(int a[],int low,int high) {
		int pivot=a[high];
		
		int left = low;
		int right = high-1;
		while(left<right){
			while(a[left]<=pivot&&left<right){
				left++;
			}
			while(a[right]>pivot&&left<right){
				right--;
			}
			if(left<right){
				int temp = a[left];
				a[left]=a[right];
				a[right]=temp;
			}
		}
		a[high]=a[right];
		a[right]=pivot;
		
		return right;
	}
	
	
	public int partition(int a[],int low,int high) {
		int pivot=a[low];
		
		int left = low;
		int right = high;
		
		while(left<right){
			while(a[left]<=pivot){
				left++;
			}
			while(a[right]>pivot){
				right--;
			}
			if(left<right){
				int temp = a[left];
				a[left]=a[right];
				a[right]=temp;
			}
		}
		a[low]=a[right];
		a[right]=pivot;
		
		return right;
	}
	
	
}
