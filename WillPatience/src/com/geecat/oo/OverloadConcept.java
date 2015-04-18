package com.geecat.oo;

public class OverloadConcept {
	public static void main(String... args) {
		OverloadConcept o = new OverloadConcept();
		o.Version(null);

	}
	
	public void Version(String s){
		System.out.println("Inside String version");
	}
	
	/*public void Version(Integer i){
		System.out.println("Inside Integer version");
	}*/
	
	public void Version(Object o){
		System.out.println("Inside object version.");
	}
}
