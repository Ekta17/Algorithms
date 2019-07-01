package StringsUtility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckAnagramTest {

	@Test
	void testCheckIfAnagramWhen1OfStringIsNull() {
		String s1 = null;
		String s2 = "S";
		assertFalse(CheckAnagram.checkIfAnagram(s1, s2));
	}
	
	@Test
	void testCheckIfAnagramWhen1OfStringIsEmpty() {
		String s1 = "";
		String s2 = "S";
		assertFalse(CheckAnagram.checkIfAnagram(s1, s2));
	}
	
	@Test
	void testCheckIfAnagramWhenBothStringsAreNull() {
		String s1 = null;
		String s2 = null;
		assertFalse(CheckAnagram.checkIfAnagram(s1, s2));
	}

	@Test
	void testCheckIfAnagramWhenBothStringsAreEmpty() {
		String s1 = "";
		String s2 = "";
		assertFalse(CheckAnagram.checkIfAnagram(s1, s2));
	}
	
	@Test
	void testCheckIfAnagramWhenBothStringsAreOfDifferentLength() {
		String s1 = "ABCD";
		String s2 = "AB";
		assertFalse(CheckAnagram.checkIfAnagram(s1, s2));
	}
	
	@Test
	void testCheckIfAnagramWhenStringsAreAnagram() {
		String s1 = "ABC";
		String s2 = "CAB";
		assertTrue(CheckAnagram.checkIfAnagram(s1, s2));
	}
	
	@Test
	void testCheckIfAnagramWhenStringsSameLengthButNotAnagram() {
		String s1 = "ABC";
		String s2 = "ADB";
		assertFalse(CheckAnagram.checkIfAnagram(s1, s2));
	}
	
	@Test
	void testCheckIfAnagramWhenStringsAreEqual() {
		String s1 = "ABC";
		String s2 = "ABC";
		assertTrue(CheckAnagram.checkIfAnagram(s1, s2));
	}
	
	@Test
	void testCheckIfAnagramWhenStringsHaveSameCharacters() {
		String s1 = "AAA";
		String s2 = "AAA";
		assertTrue(CheckAnagram.checkIfAnagram(s1, s2));
	}
}
