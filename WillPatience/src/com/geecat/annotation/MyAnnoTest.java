package com.geecat.annotation;

import java.lang.reflect.Method;

public class MyAnnoTest{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		myMeth();

	}
	
	@MyAnno(str="Hello my first annotaion ",val=100)
	public static void myMeth() throws NoSuchMethodException, SecurityException{
		MyAnnoTest myAnnoTest = new MyAnnoTest();
		
		Class<? extends MyAnnoTest> c = myAnnoTest.getClass();
		
		Method method = c.getMethod("myMeth");
		
		MyAnno anno = method.getAnnotation(MyAnno.class);
		System.out.println(anno.str()+anno.val());
		System.out.println(anno.annotationType());
	}

}
