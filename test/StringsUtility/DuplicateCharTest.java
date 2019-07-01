package StringsUtility;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class DuplicateCharTest {

	@Test
	void testPrintDuplicateWhenStringIsEmpty() {
		String s = "";
		assertEquals(0, DuplicateChar.printDuplicate(s).size());
	}
	
	@Test
	void testPrintDuplicateWhenStringIsNull() {
		String s = null; 
		assertEquals(0, DuplicateChar.printDuplicate(s).size());
	}

	@Test
	void testPrintDuplicateWhenStringContains1Char() {
		String s = "A";
		assertEquals(0, DuplicateChar.printDuplicate(s).size());
	}
	
	@Test
	void testPrintDuplicateWhenStringContainsAll2SameChar() {
		String s = "AA";
		List<Character> actualResult = DuplicateChar.printDuplicate(s);
		assertNotNull(actualResult);
		assertEquals(1, actualResult.size());
		assertEquals('A', actualResult.get(0));
	}
	
	@Test
	void testPrintDuplicateWhenStringContainsAll3SameChar() {
		String s = "AAA";
		List<Character> actualResult = DuplicateChar.printDuplicate(s);
		assertNotNull(actualResult);
		assertEquals(1, actualResult.size());
		assertEquals('A', actualResult.get(0));
	}
	
	@Test
	void testPrintDuplicateWhenStringContainsMixOfChar() {
		String s = "AABCCCDDE"; 
		List<Character> actualResult = DuplicateChar.printDuplicate(s);
		assertNotNull(actualResult);
		assertEquals(3, actualResult.size());
		assertEquals('A', actualResult.get(0));
		assertEquals('C', actualResult.get(1));
		assertEquals('D', actualResult.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> actualResult.get(3));
	}
}
