package StringsUtility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import StringsUtility.Reverse;

class ReverseTest {

	@Test
	void testReverseWhenStringIsNull() {
		String s = null;
		assertEquals("", Reverse.reverseString(s));
	}
	
	@Test
	void testReverseWhenStringIsEmpty() {
		String s = "";
		assertEquals("", Reverse.reverseString(s));
	}

	@Test
	void testReverseWhenStringHas1Char() {
		String s = "A"; 
		assertEquals("A", Reverse.reverseString(s));
	}
	
	@Test
	void testReverseWhenStringHasMoreThan1Char() {
		String s = "ABCAD"; 
		assertEquals("DACBA", Reverse.reverseString(s));
	}
	
	@Test
	void testReverseWhenStringIsPalindrome() {
		String s = "ABA"; 
		assertEquals(s, Reverse.reverseString(s));
	}
	
	@Test
	void testReverseWhenStringIsSameCharacter() {
		String s = "AAA"; 
		assertEquals(s, Reverse.reverseString(s));
	}

}
