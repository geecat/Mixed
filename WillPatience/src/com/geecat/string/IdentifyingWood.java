package com.geecat.string;

public class IdentifyingWood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inPut = "abcdefgh";
		String pat = "a.*d.*g.*";
		System.out.println(inPut.matches(pat));
		if(inPut.matches(pat)){
			System.out.println("Yep, it's wood.");
		}else{
			System.out.println("Nope.");
		}
	}
	
	public void  Stringa(int i, float f, String j){
		
	}
public void  Stringa( float f, String j,int i){
		
	}
	public String check(String s, String t){
		String message = null;
		//String inPut = "abcdefgh";
		//String pat = "a.*d.*g.*";
		char []intp = t.toCharArray();
		String sp = null;
		for (int i = 0; i < intp.length; i++) {
			char c = intp[i];
			sp = sp+c+".*";
			
		}
		
		if(s.matches(sp)){
			message = "Yep, it's wood.";
		}else{
			message = "Nope.";
		}
		
		return message;
		
	}

}
