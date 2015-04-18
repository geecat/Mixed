package com.geecat.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BytelandianGoldCoin {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null && !line.equals("")) {
			int N = Integer.parseInt(line);
			int nby2 = N / 2;
			int nby3 = N / 3;
			int nby4 = N / 4;

			int total = nby2 + nby3 + nby4;
			if (total > N) {
				System.out.println(total);
			} else {
				System.out.println(N);
			}
		}

	}
	
	private static int intGetCount(int coin){
		
		return coin;
	}

}
