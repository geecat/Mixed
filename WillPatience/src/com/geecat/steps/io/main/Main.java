package com.geecat.steps.io.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter character , 'q' to quit.");
		int i = 3;
		//Read characters
		do {
			int c;
			try {
				c = br.read();
				System.out.println((char)c);
				i-=1;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Fucking shit man you got me!! ha ha");
			}
			
		} while (i>0);*/
		
		FileInputStream fin;
		FileOutputStream fout;
		int i;
		try {
			fin = new FileInputStream("C:\\Users\\Geecat\\Main.java");
			fout = new FileOutputStream("C:\\Users\\Geecat\\Main.java");
			do {
				i=fin.read();
				if(i!=-1){
					fout.write(i);
				}
			} while (i!=-1);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
