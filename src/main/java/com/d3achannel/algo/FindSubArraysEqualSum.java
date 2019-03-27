package com.d3achannel.algo;

public class GFG {

	public static int canThreePartsEqualSum(int[] A) {
		int noofsubsets = 3;
		int partSum = 0;
		int sum = 0;
		for (int i : A) {
			sum += i;
		}
		if (sum % noofsubsets == 0) {
			partSum = sum / noofsubsets;
			return find(A, partSum, A.length - 1);
		} else {
			return 0;
		}

	}

	public static int find(int[] A, int total, int i) {
		if (A.length == 0)
			return 0;
		else if (total < 0)
			return 0;
		else if (i < 0)
			return 0;
		else if (total < A[i]) {
			return find(A, total, i - 1);
		} else {

			return find(A, total - A[i], i - 1) + find(A, total, i - 1);
		}
	}

	public static void main(String args[]) {
		
		int[] arr = { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 };

		System.out.print(canThreePartsEqualSum(arr));

	}
}
