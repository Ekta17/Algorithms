package searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import utilities.Util;

public class BinarySearch {

	public static int binarySearch(int[] a, int elementToSearch, int low, int high) {
		if (!Util.isEmptyOrNull(a) && low <= high) {

			int mid = low + (high - low) / 2; // This is better than expresssion [(high + low) / 2] which might cause
												// stackoverflow
			if (a[mid] == elementToSearch)
				return mid;
			else if (a[mid] > elementToSearch)
				return binarySearch(a, elementToSearch, low, mid - 1);
			else
				return binarySearch(a, elementToSearch, mid + 1, high);
		} else
			return -1;
	}
}
