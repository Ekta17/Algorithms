package StringsUtility;

public class ReverseUsingRecursion {

	public static String reverseString(String s) {
		if (s.length() < 2)
			return s;
		else
			return reverseString(s.substring(1)) + s.charAt(0);
	}
}
