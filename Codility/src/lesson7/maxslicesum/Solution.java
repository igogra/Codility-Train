package lesson7.maxslicesum;

class Solution {
	public int solution(int[] A) {
		int maxEnding = A[0];
		int maxSum = A[0];

		for (int i = 1; i < A.length; i++) {
			maxEnding = Math.max(A[i], maxEnding + A[i]);
			maxSum = Math.max(maxSum, maxEnding);
		}

		return maxSum;
	}
}
