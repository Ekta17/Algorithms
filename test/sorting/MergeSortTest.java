package sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import sorting.MergeSort;

class MergeSortTest {

	@Test
	void testMergeSort() {
		int[] a = { 5, 2, 3, 1, 0 };
		int[] expectedSortedArray = { 0, 1, 2, 3, 5 };

		MergeSort.mergeSort(a, 0, a.length - 1);
		assertTrue(Arrays.equals(expectedSortedArray, a));
	}

	@Test
	void testMergeSortWhenOnlyOneElement() {
		int[] a = { 1 };
		int[] expectedSortedArray = { 1 };

		MergeSort.mergeSort(a, 0, a.length - 1);
		assertTrue(Arrays.equals(expectedSortedArray, a));
	}

	@Test
	void testMergeSortWhenAllElementsAreEqual() {
		int[] a = { 1, 1, 1, 1 };
		int[] expectedSortedArray = { 1, 1, 1, 1 };

		MergeSort.mergeSort(a, 0, a.length - 1);
		assertTrue(Arrays.equals(expectedSortedArray, a));
	}

	@Test
	void testMergeSortWhenSomeElementsAreEqual() {
		int[] a = { 1, 2, 3, 4, 1, 1 };
		int[] expectedSortedArray = { 1, 1, 1, 2, 3, 4 };

		MergeSort.mergeSort(a, 0, a.length - 1);
		assertTrue(Arrays.equals(expectedSortedArray, a));
	}

	@Test
	void testMergeSortWhenArrayIsNull() {
		int[] a = null;

		assertThrows(NullPointerException.class, () -> MergeSort.mergeSort(a, 0, a.length - 1));
	}

	@Test
	void testMergeSortWhenArrayIsEmpty() {
		int[] a = new int[0];
		int[] expectedSortedArray = {};

		MergeSort.mergeSort(a, 0, a.length - 1);
		assertTrue(Arrays.equals(expectedSortedArray, a));
	}
}
