package lesson1.tapeequilibrium;

class Solution {
	public int solution(int[] A) {
		int N = A.length;
		int leftside = 0, rightside = 0;
		int minDifference = Integer.MAX_VALUE;

		for (int i = 1; i < N; i++) {
			rightside += A[i];
		}

		for (int i = 0; i < N - 1; i++) {
			leftside += A[i];
			int difference = Math.abs(leftside - rightside);

			if (minDifference > difference) {
				minDifference = difference;
			}

			rightside -= A[i + 1];
		}

		return minDifference;
	}
}
