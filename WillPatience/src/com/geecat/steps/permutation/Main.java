package com.geecat.steps.permutation;



public class Main {
	public static void main(String[] args) {
		//new DeadLock();
		long start = System.currentTimeMillis();
		String[] permute = permutation("ABC");
		System.out.println((System.currentTimeMillis()-start)/1000);
		/*for (Iterator<String> iterator = permute.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}*/
		
		if (permute!=null)
		for (int i = 0; i < permute.length; i++) {
			System.out.println(permute[i]);
		}
		
		//System.out.println(getCount(1));
		//System.out.println(getLength(6));
	}

	private static String[] permutation(String input) {
		int inputLength = input.length();
		String[] finalList=null;
		if(inputLength==1){
			String[] temp = new String[1];
			temp[0] = input;
			return temp;
		}/*if(inputLength==2){
			String[] temp = new String[2];
			temp[0] = input;
			temp[1] = swap(input);
			return  temp;
		}*/
		
		int pLength = getCount(input.length());
		finalList = new String[pLength];
		char [] iArray = input.toCharArray();
		for (int i = 0; i < iArray.length; i++) {
			String[] temp = permutation(new String(iArray).substring(1));
			for (int i1 = 0; i1 < temp.length; i1++) {
				String s = iArray[0]+temp[i1];
				finalList[temp.length*i+i1]=s;
				
			}
			if(i<inputLength-1){
				char temp1 = iArray[0];
				iArray[0]=iArray[i+1];
				iArray[i+1]=temp1;
			}
		}
		
		
		return finalList;
	}
	
	
	
	/*if(inputLength==2){
		String[] temp = new String[2];
		temp[0] = input;
		temp[1] = swap(input);
		return  temp;
	}*/

	/*private static ArrayList<String> permutation(String input){
		ArrayList<String> finalString = new ArrayList<String>();
		if(input==null){
			return null;
		}else{
			if(input.length()==1){
				return
			}
			
		}
			
		return finalString;
	}*/
	/*private static String[] permutation(String input){
		String[] finalString = null;
		if(input==null||input.length()==0){
			return null;
		}else{
			if(input.length()==2){
				String[] temp = new String[2];
				temp[0] = input;
				temp[1] = swap(input);
				return  temp;
			}
			int length = input.length();
			int count = getCount(length);
			finalString = new String[count];
			char []c = input.toCharArray();
			for (int i = 0; i < length; i++) {
				
				String[] intermediate = permutation(new String(c).substring(1));
				for (int j = 0; j < intermediate.length; j++) {
					String s = c[0]+intermediate[j];
					finalString[intermediate.length*i+j]=s;
					//System.out.println(s);
				}
				
				if((i+1<input.length())){
					char temp = c[0];
					c[0]=c[i+1];
					c[i+1]=temp;
				}
				
			}
			
		}
			
		return finalString;
	}*/
	
/*	private static String[] permutation(String input){
		String[] finalString = null;
		if(input.length()==2){
			finalString = new String[2];
			finalString[0] = input;
			finalString[1] = swap(input);
			return  finalString;
		}
		int length = input.length();
		int count = getCount(length);
		finalString = new String[count];
		char []c = input.toCharArray();
		String[] intermediate = permutation(new String(c).substring(1));
		for (int i = 0; i < intermediate.length; i++) {
			String s = c[0]+intermediate[i];
			finalString[length*i] = s;
		}
		return finalString;
	}*/
	
	private static int getCount(int n){
		int a=0;
		if(n==0){
			return 0;
		}if(n==1){
			return 1;
		}
		a=n*getCount(n-1);
		return a;
	}
	private static String swap(String input){
		char[] c = input.toCharArray();
		char ctemp = c[0];
		c[0]=c[1];
		c[1]=ctemp;
		String s = new String(c);
		return s;
	}
	
	
}
