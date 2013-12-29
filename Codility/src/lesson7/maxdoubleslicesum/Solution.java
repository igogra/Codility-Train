package lesson7.maxdoubleslicesum;

class Solution {
	public int solution(int[] A) {
		int N = A.length;
		int[] maxSumLeft = new int[N];
		int[] maxSumRight = new int[N];
		int candidate = 0;
		int maxSum = 0;

		for (int i = 1; i < N - 1; i++) {
			maxSumLeft[i] = Math.max(0, maxSumLeft[i - 1] + A[i]);
		}

		for (int i = N - 2; i > 0; i--) {
			maxSumRight[i] = Math.max(0, maxSumRight[i + 1] + A[i]);
		}

		for (int i = 1; i < N - 1; i++) {
			candidate = maxSumLeft[i - 1] + maxSumRight[i + 1];

			if (maxSum < candidate) {
				maxSum = candidate;
			}
		}

		return maxSum;
	}
}
