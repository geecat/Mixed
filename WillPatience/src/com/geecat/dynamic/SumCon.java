package com.geecat.dynamic;

//maximum value contiguous subsequence.
public class SumCon {
	static int a[] = { -2, 11, -4, -6, 13, 14, -5, -1, -5, 2 }; // 20
	static int b[] = { 1, -3, 4, -2, -1, 6 }; // 7
	static int c[] = { -4, -11, -3, -13, -5, -2 }; // -2
	static int d[] = { 3, 2, 5, 10, 7 }; // 15
	static int e[] = { 3, 2, 7, 10 }; // 13
	static int f[] = { 100, 2, 9, 3, 2, 45, 5 };// 154
	static int g[] = { 5, 7 };//7
	static int h[] = { 5, 5, 10, 100, 10, 5, 101 };//206
	static int al = a.length;
	static int bl = b.length;
	static int cl = c.length;

	public static void main(String[] args) {

		// System.out.println("Sum n2 : " + n2Sum(c));
		// System.out.println("Sum n1 : " + n1Sum(c));
		// System.out.println("Sum DP : " + SumDp(c));
		// System.out.println("Sum Elements not Contiguous 2 : " +
		// sumNotContiguous2(a));
		System.out.println("Sum Elements not Contiguous  : " + sumNotContiguous(h, 0));
		System.out.println("Sum Elements not Contiguous Dp : " + sumNotContiguousDP(h, h.length));
	}

	// Max contiguous sum when input are not consecutive in the array.

	static int sumDp[] = new int[al];

	private static int sumNotContiguousDP(int a[], int n) {

		sumDp[0] = a[0];
		sumDp[1] = (a[0] > a[1] ? a[0] : a[1]);
		for (int i = 2; i < a.length; i++) {
			sumDp[i] = (sumDp[i - 1] > sumDp[i - 2] + a[i] ? sumDp[i - 1] : sumDp[i - 2] + a[i]);
		}

		return sumDp[n - 1];

	}

	private static int sumNotContiguous(int a[], int n) {
		int maxSum = 0, currentSum = 0;
		int length = a.length - n;
		if (length == 1) {
			return a[n];

		} else if (length == 2) {
			if (a[n + 1] > a[n]) {
				return a[n + 1];
			} else {
				return a[n];
			}
		}
		for (int i = n; i < a.length; i++) {
			currentSum = a[i] + sumNotContiguous(a, i + 2);
			if (currentSum > maxSum) {
				maxSum = currentSum;
			} else if (currentSum < 0) {
				currentSum = 0;
			}
		}
		if (currentSum > maxSum) {
			maxSum = currentSum;
		}
		return maxSum;
	}

	// this is not correct
	private static int sumNotContiguous2(int a[]) {
		int maxSum = 0, currentSum;
		for (int i = 0; i < a.length; i++) {
			// currentSum = a[i];
			for (int j1 = i + 2; j1 < a.length; j1 = j1 + 1) {
				currentSum = a[i];
				for (int j = j1; j < a.length; j = j + 2) {
					currentSum += a[j];
					if (currentSum > maxSum) {
						maxSum = currentSum;
					} else if (currentSum < 0) {
						currentSum = 0;
					}

				}
			}

		}
		return maxSum;
	}

	static int sum[] = new int[bl];

	private static int SumDp(int a[]) {

		int maxSum = 0;
		if (a[0] > 0) {
			sum[0] = a[0];
		} else {
			sum[0] = 0;
		}
		for (int i = 1; i < a.length; i++) {
			if (sum[i - 1] + a[i] > 0) {
				sum[i] = sum[i - 1] + a[i];
			} else {
				sum[i] = 0;
			}

		}

		for (int i = 0; i < a.length; i++) {
			if (sum[i] > maxSum) {
				maxSum = sum[i];
			}
		}

		return maxSum;
	}

	private static int n2Sum(int a[]) {

		int maxSum = 0;
		int currentSum = 0;
		for (int i = 0; i < a.length; i++) {
			currentSum = 0;
			for (int j = i; j < a.length; j++) {
				currentSum += a[j];
				if (currentSum > maxSum) {
					maxSum = currentSum;
				} else if (currentSum < 0) {
					currentSum = 0;
				}
			}
		}
		return maxSum;
	}

	private static int n1Sum(int a[]) {

		int maxSum = 0;
		int currentSum = 0;
		for (int i = 0; i < a.length; i++) {
			currentSum += a[i];
			if (currentSum > maxSum) {
				maxSum = currentSum;
			} else if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return maxSum;
	}
}
