package lesson4.triangle;

import java.util.Arrays;

class Solution {
	public int solution(int[] A) {
		Arrays.sort(A);

		for (int i = A.length - 1; i > 1; i--) {
			if (A[i - 2] + A[i - 1] - A[i] > 0) {
				return 1;
			}
		}

		return 0;
	}
}
