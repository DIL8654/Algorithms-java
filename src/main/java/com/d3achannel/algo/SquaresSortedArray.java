package com.d3achannel.algo;

import java.util.Arrays;

public class SquaresSortedArray {

	public static int[] sortedSquares(int[] A) {

		int[] out = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			out[i] = A[i] * A[i];
		}

		Arrays.sort(out);
		return out;

	}

	public static int[] sortedSquares2(int[] A) {

		int[] out = new int[A.length];
		int len = A.length;

		int positiveIndex = 0;
		int negativeEndIndex = 0;

		while (positiveIndex < len && A[positiveIndex] < 0) {
			positiveIndex++;
		}
		negativeEndIndex = positiveIndex - 1;

		int idx = 0;
		while (negativeEndIndex >= 0 && positiveIndex < len) {
			if (A[negativeEndIndex] * A[negativeEndIndex] < A[positiveIndex] * A[positiveIndex]) {
				out[idx++] = A[positiveIndex] * A[positiveIndex];
				negativeEndIndex--;
			} else {
				out[idx++] = A[positiveIndex] * A[positiveIndex];
				positiveIndex++;
			}
		}

		while (negativeEndIndex >= 0) {
			out[idx++] = A[negativeEndIndex] * A[negativeEndIndex];
			negativeEndIndex--;
		}
		while (positiveIndex < len) {
			out[idx++] = A[positiveIndex] * A[positiveIndex];
			positiveIndex++;
		}

		return out;

	}

	public static void main(String[] args) {

		int[] x = { -4, -1, 0, 3, 10 };
//		printArray(sortedSquares(x));
		printArray(sortedSquares2(x));

	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println("");
	}

}
