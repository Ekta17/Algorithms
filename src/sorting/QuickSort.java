package sorting;

import utilities.Util;

/*
 * Comparison sort
 * 
 * Chooses a pivot element 
 * and then arranges elements in the array such that 
 * elements smaller than the pivot are placed on the left of pivot 
 * and elements greater than the pivot are placed on the right of pivot.
 * 
 * In the below implementation, we choose pivot as the last element in the array. 
 * This implementation of choosing pivot is based on Lomuto Partitioning method.
 * 
 *
 */

public class QuickSort {

	public static int[] quickSort(int[] a) {
		if (!Util.isEmptyOrNull(a))
			return quickSort(a, 0, a.length-1);
		return a;
	}

	private static int[] quickSort(int[] a, int begin, int end) {
		if (begin < end) {
			int pivot = partition(a, begin, end);
			quickSort(a, begin, pivot - 1);
			quickSort(a, pivot + 1, end);
		}
		return a;
	}

	private static int partition(int[] a, int begin, int end) {
		int pivot = a[end];

		int i = begin - 1;
		for (int j = begin; j <= end - 1; j++) {
			if (a[j] <= pivot) {
				i++;
				Util.swapArrayElements(a, i, j);
			}
		}
		Util.swapArrayElements(a, end, i + 1);
		return i + 1;
	}
}
