package com.geecat.steps.io.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) throws IOException {
		//InputStreamReader cin = new InputStreamReader(System.in);
		//InputStream is = new 
		Scanner scan = new Scanner(System.in);
		//cin
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int a = Integer.parseInt(br.readLine());
		// Float.parseFloat(br.readLine());
		for (int i = 0; i < a; i++) {
			System.out.println(Float.parseFloat(br.readLine()));
		}*/
		String str = "Ravi";
		str.substring(0, 1);
		Map map = new HashMap<String, Integer>();
		Integer a = (Integer) map.get("a");
		//System.out.println(a);
		char temp = str.charAt(3);
		System.out.println(temp);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
	}

}
