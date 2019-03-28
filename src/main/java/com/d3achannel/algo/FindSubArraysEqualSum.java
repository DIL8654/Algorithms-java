package com.d3achannel.algo;

public class FindSubArraysEqualSum {

	public static boolean canThreePartsEqualSum(int[] A) {
		int sum = 0;
		for (int i : A) {
			sum += i;
		}
		if (sum % 3 != 0)
			return false;

		int partSum = sum / 3;
		int count = 0;
		int curr = 0;

		for (int a : A) {
			curr = curr + a;
			if (curr == partSum) {
				curr = 0;
				count++;
			}
		}
		return count >= 3;
	}



	public static void main(String args[]) {

		int[] arr = { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 };

		System.out.print(canThreePartsEqualSum(arr));

	}
}
