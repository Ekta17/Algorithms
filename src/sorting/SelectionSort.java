package sorting;

import utilities.Util;

/*
 * Comparison Sort
 * Finds maximum value in an array and swaps with the element at (n-1) location
 */
public class SelectionSort {

	public static int[] selectionSort(int[] a) {

		if (!Util.isEmptyOrNull(a)) {
			for (int i = 0; i < a.length - 1; i++) {
				int min = i;
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] < a[min])
						min = j;
				}
				Util.swapArrayElements(a, i, min);
			}
		}
		return a;
	}

}
