package StringsUtility;

import utilities.Util;

/*
 * Reverse a given string in place
 */

public class Reverse {

	public static String reverseString(String s) {

		if (!Util.isEmptyOrNull(s)) {
			char[] reversedArray = s.toCharArray();
			int i = 0, j = s.length() - 1;
			while (i < j) {
				swapCharacters(reversedArray, i, j);
				i++;
				j--;
			}
			return new String(reversedArray);
		}
		return "";
	}

	private static void swapCharacters(char[] sArray, int i, int j) {
		char temp = sArray[i];
		sArray[i] = sArray[j];
		sArray[j] = temp;
	}

}
