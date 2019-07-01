package StringsUtility;

import java.util.Arrays;

import utilities.Util;

/*
 * check if two strings are anagrams of each other
 * (OR)
 * check if two strings are permutation of each other
 */

public class CheckAnagram {

	public static boolean checkIfAnagram(String s1, String s2) {

		boolean isAnagram = false;
		
		if (!Util.isEmptyOrNull(s1) && !Util.isEmptyOrNull(s2) && s1.length() == s2.length())
			isAnagram = sort(s1).equals(sort(s2)) ? true : false;
		else
			System.out.println("Input Strings cannot be null or empty and should be of same length");

		return isAnagram;
	}

	private static String sort(String s) {
		return s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}
}
