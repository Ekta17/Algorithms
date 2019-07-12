package searching;

import utilities.Util;

public class CountNumberOfOccuranceOfTarget {

	public static int countOccuranceOfTarget(int[] a, int elementToSearch) {
		if (!Util.isEmptyOrNull(a)) {

			int lastOccurance = LastOccuranceOfTarget.lastOccuranceOfTarget(a, elementToSearch, 0, a.length - 1);
			int firstOccurance = FirstOccuranceOfTarget.firstOccuranceOfTarget(a, elementToSearch, 0, a.length - 1);

			if (lastOccurance != -1 && firstOccurance != -1)
				return (lastOccurance - firstOccurance + 1);

		} 
		
		return -1;
	}

}
