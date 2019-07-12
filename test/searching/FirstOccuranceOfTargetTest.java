package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstOccuranceOfTargetTest {

	@Test
	void testFirstOccuranceOfTarget() {
		int[] a = { 2, 3, 3, 3, 3, 9 };
		int elementToSearch = 3;
		assertEquals(1, FirstOccuranceOfTarget.firstOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testFirstOccuranceOfTargetWhenTargetIsMid() {
		int[] a = { 1, 2, 3, 3, 9 };
		int elementToSearch = 3;
		assertEquals(2, FirstOccuranceOfTarget.firstOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testFirstOccuranceOfTargetWhenTargetIsNotPresent() {
		int[] a = { 1, 2, 3, 3, 9 };
		int elementToSearch = 4;
		assertEquals(-1, FirstOccuranceOfTarget.firstOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testFirstOccuranceOfTargetWhenAllElementsAreSame() {
		int[] a = { 3, 3, 3, 3 };
		int elementToSearch = 3;
		assertEquals(0, FirstOccuranceOfTarget.firstOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testFirstOccuranceOfTargetWhenTargetIsFirstElement() {
		int[] a = { 3, 4, 4, 5, 6, 6, 7, 7 };
		int elementToSearch = 3;
		assertEquals(0, FirstOccuranceOfTarget.firstOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testFirstOccuranceOfTargetWhenTargetIsLastElement() {
		int[] a = { 1, 2, 3 };
		int elementToSearch = 3;
		assertEquals(2, FirstOccuranceOfTarget.firstOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

}
