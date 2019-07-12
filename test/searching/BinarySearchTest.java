package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void testBinarySearchWhenElementIsPresent() {
		int[] a = { 2, 3, 4, 7, 8, 9 };
		int elementToSearch = 3;
		assertEquals(1, BinarySearch.binarySearch(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testBinarySearchWhenElementIsNotPresent() {
		int[] a = { 2, 3, 4, 7, 8, 9 };
		int elementToSearch = 1;
		assertEquals(-1, BinarySearch.binarySearch(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testBinarySearchWhenElementIsMid() {
		int[] a = { 2, 3, 4, 7, 8, 9 };
		int elementToSearch = 4;
		assertEquals(2, BinarySearch.binarySearch(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testBinarySearchWhenElementIsInRightHalf() {
		int[] a = { 2, 3, 4, 7, 8, 9 };
		int elementToSearch = 9;
		assertEquals(5, BinarySearch.binarySearch(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testBinarySearchWhenElementIsInLeftHalf() {
		int[] a = { 2, 3, 4, 7, 8, 9 };
		int elementToSearch = 2;
		assertEquals(0, BinarySearch.binarySearch(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testBinarySearchWhenLowIsGreaterThanHigh() {
		int[] a = { 2, 3, 4, 7, 8, 9 };
		int elementToSearch = 2;
		assertEquals(-1, BinarySearch.binarySearch(a, elementToSearch, a.length - 1, 0));
	}

	@Test
	void testBinarySearchWhenArrayIsEmpty() {
		int[] a = {};
		int elementToSearch = 2;
		assertEquals(-1, BinarySearch.binarySearch(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testBinarySearchWhenArrayHasOneElement() {
		int[] a = { 1 };
		int elementToSearch = 1;
		assertEquals(0, BinarySearch.binarySearch(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testBinarySearchWhenArrayHasOneElementAndTargetNotPresent() {
		int[] a = { 1 };
		int elementToSearch = 2;
		assertEquals(-1, BinarySearch.binarySearch(a, elementToSearch, 0, a.length - 1));
	}
}
