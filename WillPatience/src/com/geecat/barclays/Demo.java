package com.geecat.barclays;

public class Demo {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int a[] = { -1, 3, -4, 5, 1, -6, 2, 1 };
		System.out.println(sol.solution(a));

	}

}

class Solution1 {
	public int solution(int[] A) {
		return equi(A);
	}

	public int equi(int[] A) {
		long sum = 0;
		long leftSum = 0;

		for (int i = 0; i < A.length; i++) {
			leftSum += A[i];
		}
		for (int i = 0; i < A.length; i++) {
			if (sum == leftSum - A[i])
				return i;
			sum += A[i];
			leftSum -= A[i];
		}
		return -1;

	}
}