package com.geecat.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderUtil {

	public String[] readDictionary(String path) throws IOException{
		String []dict;
		InputStream in = this.getClass().getResourceAsStream(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		int count = 0;
		while (br.readLine()!=null){
			count++;
		}
		dict = new String[count];
		int a = 0;
		in = this.getClass().getResourceAsStream(path);
		br = new BufferedReader(new InputStreamReader(in));
	    try {
	        String line = br.readLine();

	        while (line != null) {
	        	dict[a++]=line;
	            line = br.readLine();
	        }
	        
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		return dict;
	}
}
