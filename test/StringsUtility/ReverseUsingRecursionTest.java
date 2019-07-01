package StringsUtility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseUsingRecursionTest {

	@Test
	void testReverseWhenStringIsNull() {
		String s = null;
		assertThrows(NullPointerException.class, () -> ReverseUsingRecursion.reverseString(s));
	}
	
	@Test
	void testReverseWhenStringIsEmpty() {
		String s = "";
		assertEquals("", ReverseUsingRecursion.reverseString(s));
	}

	@Test
	void testReverseWhenStringHas1Char() {
		String s = "A"; 
		assertEquals("A", ReverseUsingRecursion.reverseString(s));
	}
	
	@Test
	void testReverseWhenStringHasMoreThan1Char() {
		String s = "ABCAD"; 
		assertEquals("DACBA", ReverseUsingRecursion.reverseString(s));
	}
	
	@Test
	void testReverseWhenStringIsPalindrome() {
		String s = "ABA"; 
		assertEquals(s, ReverseUsingRecursion.reverseString(s));
	}
	
	@Test
	void testReverseWhenStringIsSameCharacter() {
		String s = "AAA"; 
		assertEquals(s, ReverseUsingRecursion.reverseString(s));
	}


}
