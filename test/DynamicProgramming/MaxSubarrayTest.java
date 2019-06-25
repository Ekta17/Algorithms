package DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxSubarrayTest {

	@Test
	void testGetMaxSubArraySum() {
		int[] A = {-2,3,2,-1};
		assertTrue(MaxSubarray.getMaxSubArraySum(A) == 5, "Max Sub array sum is 5");
	}
	
	@Test
	void testGetMaxSubArraySumWhenArrayContainsOneElement() {
		int[] A = {-2};
		assertTrue(MaxSubarray.getMaxSubArraySum(A) == -2, "Max Sub array sum is -2");
	}
}
