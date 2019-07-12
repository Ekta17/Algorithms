package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountNumberOfOccuranceOfTargetTest {

	@Test
	void testCountOccuranceOfTarget() {
		int[] a = { 1, 2, 3, 3, 4, 5 };
		int elementToSearch = 3;
		assertEquals(2, CountNumberOfOccuranceOfTarget.countOccuranceOfTarget(a, elementToSearch));
	}

	@Test
	void testCountOccuranceOfTargetWhenTargetNotPresent() {
		int[] a = { 1, 2, 3, 3, 4, 5 };
		int elementToSearch = 6;
		assertEquals(-1, CountNumberOfOccuranceOfTarget.countOccuranceOfTarget(a, elementToSearch));
	}

	@Test
	void testCountOccuranceOfTargetWhenAllElementsAreSame() {
		int[] a = { 1, 1, 1, 1 };
		int elementToSearch = 4;
		assertEquals(-1, CountNumberOfOccuranceOfTarget.countOccuranceOfTarget(a, elementToSearch));
	}

}
