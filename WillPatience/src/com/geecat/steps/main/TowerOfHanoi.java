package com.geecat.steps.main;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		towerOfHanoi(3,"A","B","C");
	}
	
	
	private static void towerOfHanoi(int n , String source, String aux, String dest){
		if(n==1){
			System.out.println("Move "+n+" from "+source+" to "+dest);
		}else{
			towerOfHanoi(n-1, source, dest, aux);
			System.out.println("Move "+n+" from "+source+" to "+dest);
			towerOfHanoi(n-1, aux, source, dest);
		}
		
		
	}

}
