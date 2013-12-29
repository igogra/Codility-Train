package lesson7.maxprofit;

class Solution {
	public int solution(int[] A) {
		int minShare = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < A.length; i++) {
			if (minShare > A[i]) {
				minShare = A[i];
			}

			if (maxProfit < A[i] - minShare) {
				maxProfit = A[i] - minShare;
			}
		}

		return maxProfit;
	}
}
