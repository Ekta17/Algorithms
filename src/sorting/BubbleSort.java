package sorting;

import utilities.Util;

/*
 * Comparison sort
 * Compares adjacent  elements and at the end of first iteration, the biggest element is placed at its correct location
 */
public class BubbleSort {

	public static int[] bubbleSort(int[] a) {

		if (!Util.isEmptyOrNull(a)) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length - 1; j++) {
					if (a[i] < a[j])
						Util.swapArrayElements(a, i, j);
				}
			}
		}
		
		return a;
	}
}
