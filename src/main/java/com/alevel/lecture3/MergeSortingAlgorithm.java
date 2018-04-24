package com.alevel.lecture3;

import java.util.Arrays;

/**
 * The merge sort algorithm.
 */
public class MergeSortingAlgorithm implements SortingAlgorithm {
	private int[] sorting(int[] arr) {
		if(arr.length < 2) return arr;
		int mid = arr.length / 2;
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);

		return merge(sorting(left), sorting(right));
	}

	private static int[] merge(int[] left, int[] right) {
		int n = left.length + right.length;
		int[] arr = new int[n];
		int int1 = 0;
		int int2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (int1 == left.length) {

				arr[i] = right[int2++];
			} else if (int2 == right.length) {

				arr[i] = left[int1++];
			} else {

				if (left[int1] < right[int2]) {

					arr[i] = left[int1++];
				} else {
					arr[i] = right[int2++];
				}
			}
		}

		return arr;
	}

	@Override
	public int[] sort(int[] source) {

		return sorting(source);
	}
}
