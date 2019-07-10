package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void testBubbleSort() {
		int[] arrayOfInt = { 4, 3, 0, 8, 1 };
		int[] expectedResults = { 0, 1, 3, 4, 8 };
		int[] actualResults = BubbleSort.bubbleSort(arrayOfInt);
		assertNotNull(actualResults);
		assertArrayEquals(expectedResults, actualResults);
	}

	@Test
	void testBubbleSortWhenArrayIsNull() {
		int[] arrayOfInt = null;
		int[] actualResults = BubbleSort.bubbleSort(arrayOfInt);
		assertNull(actualResults);
	}

	@Test
	void testBubbleSortWhenArrayIsEmpty() {
		int[] arrayOfInt = {};
		int[] expectedResults = {};
		int[] actualResults = BubbleSort.bubbleSort(arrayOfInt);
		assertNotNull(actualResults);
		assertArrayEquals(expectedResults, actualResults);
	}

	@Test
	void testBubbleSortWhenArrayHasOneElement() {
		int[] arrayOfInt = { 2 };
		int[] expectedResults = { 2 };
		int[] actualResults = BubbleSort.bubbleSort(arrayOfInt);
		assertNotNull(actualResults);
		assertArrayEquals(expectedResults, actualResults);
	}

	@Test
	void testBubbleSortWhenArrayIsSorted() {
		int[] arrayOfInt = { 0, 1, 3, 4, 8 };
		int[] expectedResults = { 0, 1, 3, 4, 8 };
		int[] actualResults = BubbleSort.bubbleSort(arrayOfInt);
		assertNotNull(actualResults);
		assertArrayEquals(expectedResults, actualResults);
	}

}
