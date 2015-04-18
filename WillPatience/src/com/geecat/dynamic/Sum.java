package com.geecat.dynamic;

public class Sum {
	static int n = 6;

	public static void main(String[] args) {

		System.out.println("Sum : " + sum(n));
		System.out.println("SumDp : " + sumDp(n));
	}

	private static int sum(int n) {
		int t = 0;
		if (n == 0 || n == 1)
			return 2;
		for (int i = 1; i < n; i++) {
			t += 2 * sum(i) * sum(i - 1);
		}
		return t;
	}

	static int t[] = new int[n+1];

	private static int sumDp(int n) {
		t[0] = t[1] = 2;
		t[2] = 2 * t[1] * t[0];
		for (int i = 3; i <= n; i++) {
			t[i] = t[i - 1] + (2 * t[i - 1] * t[i - 2]);
		}

		return t[n];
	}
}
