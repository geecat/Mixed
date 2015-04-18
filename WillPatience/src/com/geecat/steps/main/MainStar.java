package com.geecat.steps.main;

public class MainStar {

	public static void main(String[] args) {
		/*for(int i=1;i<10;i++){
		for(int i1=0;i1<i;i1++){
			System.out.print("*");
			}
		System.out.println();
		}*/
		int n = 6;
		for (int i = 0; i < n; i++) {
			int space = n-i-1;
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<(2*i+1);k++){
				if(k%2==0){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
