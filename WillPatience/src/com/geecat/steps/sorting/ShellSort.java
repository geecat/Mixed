package com.geecat.steps.sorting;

public class ShellSort{
    public static void main(String args[]){
        Integer a[] = {51, 71, 83, 33, 93 ,92, 56, 55 ,19, 18 };
        sort(a);
        System.out.print("Done");
    }
    
    public static void sort(Comparable[]a){
    int n = a.length;
    int h = 1;
    while(h<n/3) h=3*h+1;
    
    while(h>=1)
    {
        for(int i=h;i<n;i++){
            for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h){
             exch(a,j,j-h);   
        }
    }
        h=h/3;
}
    
}
    
    private static boolean less(Comparable v, Comparable w){
    return v.compareTo(w)<0;
    }
    
    private static void exch(Comparable[]a, int i, int j){
    Comparable swap = a[i];
    a[i]=a[j];
    a[j]=swap;
    }
}