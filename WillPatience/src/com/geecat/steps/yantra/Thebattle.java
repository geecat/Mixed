package com.geecat.steps.yantra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
/**
 * http://math.stackexchange.com/questions/357057/convex-polygon-with-18-vertices-and-points-of-intersection-of-the-diagonals
 * @author Geecat
 *
 */
class TestClass11 {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		BigInteger   n = BigInteger.valueOf(Integer.parseInt(line)) ;
		BigInteger nMinusOne = n.subtract(new BigInteger("1"));
		BigInteger nMinusTwo = n.subtract(new BigInteger("2"));
		BigInteger nMinusThree = n.subtract(new BigInteger("3"));
		BigInteger result = new BigInteger("1");
		result = result.multiply(n).multiply(nMinusOne).multiply(nMinusTwo).multiply(nMinusThree);
		result = result.divide(new BigInteger("24"));
		result = result.mod(new BigInteger("1000000007"));
		System.out.println(result);
	}
	
	
}
