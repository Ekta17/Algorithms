package DynamicProgramming;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import utilities.Util;

/**
 * 
 * Implementation of Kadane's Algorithm 
 * for solving maximun sub array sum 
 * Time complexity of this solution = O(n)
 * Other ways to solve:
 * 	- Divide and Conquer : O(nlogn)
 * 	- Brute force : O(n2)
 *
 *	Example: A = [-2,3,2,-1]
 *	Output: 5 --> [3,2] at indexes [1,2]
 *
 */
public class MaxSubarray {
		
	static int getMaxSubArraySum(int[] A) {
		
		int maxCurrent, maxGlobal = Integer.MIN_VALUE;
		if(!Util.isEmptyOrNull(A)) {
			maxCurrent = maxGlobal = A[0]; 
			for (int i = 1; i<A.length; i++) {
				maxCurrent = Math.max(A[i], maxCurrent + A[i]);
				if(maxCurrent > maxGlobal)
					maxGlobal = maxCurrent;
			}
		}
		
		return maxGlobal; 
	}
	
	public static void main(String[] args) {
		int[] A = {-2,3,2,-1};
		assertTrue(getMaxSubArraySum(A) == 5, "Max Sub array sum is 5");
	}

}
