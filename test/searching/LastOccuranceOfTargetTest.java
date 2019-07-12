package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LastOccuranceOfTargetTest {

	@Test
	void testLastOccuranceOfTarget() {
		int[] a = { 2, 3, 3, 3, 3, 9 };
		int elementToSearch = 3;
		assertEquals(4, LastOccuranceOfTarget.lastOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testLastOccuranceOfTargetWhenTargetIsMid() {
		int[] a = { 1, 3, 3, 8, 9 };
		int elementToSearch = 3;
		assertEquals(2, LastOccuranceOfTarget.lastOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testLastOccuranceOfTargetWhenTargetIsNotPresent() {
		int[] a = { 1, 2, 3, 3, 9 };
		int elementToSearch = 4;
		assertEquals(-1, LastOccuranceOfTarget.lastOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testLastOccuranceOfTargetWhenAllElementsAreSame() {
		int[] a = { 3, 3, 3, 3 };
		int elementToSearch = 3;
		assertEquals(3, LastOccuranceOfTarget.lastOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testLastOccuranceOfTargetWhenTargetIsFirstElement() {
		int[] a = { 3, 4, 4, 5, 6, 6, 7, 7 };
		int elementToSearch = 3;
		assertEquals(0, LastOccuranceOfTarget.lastOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

	@Test
	void testLastOccuranceOfTargetWhenTargetIsLastElement() {
		int[] a = { 1, 2, 3 };
		int elementToSearch = 3;
		assertEquals(2, LastOccuranceOfTarget.lastOccuranceOfTarget(a, elementToSearch, 0, a.length - 1));
	}

}
