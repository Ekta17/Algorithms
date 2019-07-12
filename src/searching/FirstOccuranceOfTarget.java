package searching;

import utilities.Util;

/*
 * This algorithm uses an implementation from Binary Search
 * Time complexity - O(logn)
 * 
 */
public class FirstOccuranceOfTarget {

	public static int firstOccuranceOfTarget(int[] a, int elementToSearch, int low, int high) {
		if (!Util.isEmptyOrNull(a) && low <= high) {

			int mid = low + (high - low) / 2; // This is better than expresssion [(high + low) / 2] which might cause stackoverflow
			
			if (	a[mid] == elementToSearch 
					&& 
					(mid == 0 || a[mid - 1] != elementToSearch)
				)
				return mid;
			
			else if (a[mid] >= elementToSearch)
				return firstOccuranceOfTarget(a, elementToSearch, low, mid - 1);
			else
				return firstOccuranceOfTarget(a, elementToSearch, mid + 1, high);
		} else
			return -1;
	}

}
