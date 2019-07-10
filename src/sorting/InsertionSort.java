package sorting;

import utilities.Util;

/*
 * Comparison sort
 */
public class InsertionSort {

	public static int[] insertionSort(int[] a) {

		if (!Util.isEmptyOrNull(a)) {
			for (int i = 1; i < a.length; i++) {
				int key = a[i];
				int j = i - 1;
				while (j >= 0 && a[j] > key) {
					a[j + 1] = a[j];
					j--;
				}
				a[j + 1] = key;
			}
		}

		return a;
	}

}
