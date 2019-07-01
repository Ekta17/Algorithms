package StringsUtility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utilities.Util;

/*
 * print duplicate characters from a string
 */
public class DuplicateChar {

	static List<Character> printDuplicate(String s) {
		List<Character> duplicateChar = new ArrayList<>();

		if (!Util.isEmptyOrNull(s)) {
			Map<Character, Integer> charCount = new HashMap<>();
			for (char c : s.toCharArray()) {
				if (charCount.containsKey(c)) {
					if (charCount.get(c) == 1) {
						duplicateChar.add(c);
						charCount.put(c, Integer.MAX_VALUE);
					}
				} else
					charCount.put(c, 1);
			}

			if (duplicateChar.size() == 0)
				System.out.println("No duplicate elements present in the String :: " + s);

		} else
			System.out.println("String is empty");
		return duplicateChar;
	}
}
