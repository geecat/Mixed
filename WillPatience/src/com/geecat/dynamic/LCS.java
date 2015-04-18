package com.geecat.dynamic;

import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

import com.geecat.util.FileReaderUtil;

//LCS-Longest common subsequence
public class LCS {
	static String dict[];
	static int LCS[][];

	public static void main(String[] args) throws IOException {
		FileReaderUtil reader = new FileReaderUtil();
		TreeSet<String> set = new TreeSet<String>();
		String path = "/dictionary.txt";
		//char S[] = { 'V', 'A', 'B', 'C', 'B', 'D', 'A', 'B', 'A' };
		//char T[] = { 'W', 'B', 'D', 'C', 'A', 'B', 'A' };
		char S[] = { 'A', 'B', 'C', 'D'};
		char T[] = { 'A', 'Y','B','X', 'C', 'D' };
		 int length = LCSLength(S, 0, S.length, T, 0, T.length);
		 
		 System.out.println("Length of Longest Common subsequence : " +
		 length);
		/*dict = reader.readDictionary(path);
		LCS = new int[dict.length][];
		char[] word = "lean".toCharArray();
		long start = System.currentTimeMillis();
		for (int i = 0; i < dict.length; i++) {
			int dicLength = dict[i].length();
			String dicWord = dict[i];
			// if(dicLength>=word.length&&word[0]==dict[i].charAt(0))
			if (dicLength >= word.length) {
				if(dicLength>5){
					dicWord = dicWord.substring(0, 4);
				}
				int length = LCSLength(dicWord.toCharArray(), 0, dicWord.length(), word, 0, word.length);
				if (Math.abs(length - dicWord.length()) == 1) {
					set.add(dict[i]);
					// System.out.println("Input word is : "+new
					// String(word)+", Matched word is : " + dict[i]);

				}
			}

		}
		long end = System.currentTimeMillis();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println("Input word is : " + new String(word) + ", Matched word is : " + it.next());
		}*/
		//System.out.println("Total time taken is :" + ((end - start)));
	}

	private static int LCSLength(char S[], int i, int m, char T[], int j, int n) {

		if (i == m || j == n)
			return 0;
		else if (S[i] == T[j])
			return 1 + LCSLength(S, i + 1, m, T, j + 1, n);
		else
			return Math.max(LCSLength(S, i + 1, m, T, j, n), LCSLength(S, i, m, T, j + 1, n));
	}

	private static int LCSLengthDp(char S[], int i, int m, char T[], int j, int n) {
		
		
		for (int k = m - 1; k >= 0; k++) {
			for (int l = m - 1; l >= 0; l++) {
				LCS[k][l]=LCS[k+1][l+1];
				if(S[i] == T[j]){
					LCS[k][l]++;
				}
				
				if(LCS[k][l+1]>LCS[k][l]){
					LCS[k][l]=LCS[k][l+1];
				}
				if(LCS[k+1][l]>LCS[k][l]){
					LCS[k][l]=LCS[k+1][l];
				}
			}

		}
		return LCS[0][0];
		
	}
}
