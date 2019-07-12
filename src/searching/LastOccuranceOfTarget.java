package searching;

import utilities.Util;

public class LastOccuranceOfTarget {

	public static int lastOccuranceOfTarget(int[] a, int elementToSearch, int low, int high) {
		if (!Util.isEmptyOrNull(a) && low <= high) {

			int mid = low + (high - low) / 2; // This is better than expresssion [(high + low) / 2] which might cause stackoverflow
			
			if (	a[mid] == elementToSearch 
					&& 
					(mid == high || a[mid+1] != elementToSearch)
				)
				return mid;
			
			else if (a[mid] > elementToSearch)
				return lastOccuranceOfTarget(a, elementToSearch, low, mid - 1);
			else
				return lastOccuranceOfTarget(a, elementToSearch, mid + 1, high);
		} else
			return -1;
	}
}
