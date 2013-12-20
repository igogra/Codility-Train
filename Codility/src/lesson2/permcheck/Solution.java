package lesson2.permcheck;

import java.util.Arrays;

class Solution {
	public int solution(int[] A) {
		int N = A.length;
		int[] count = new int[N];

		for (int i = 0; i < N; i++) {
			if (A[i] - 1 >= N) {
				return 0;
			} else {
				if (++count[A[i] - 1] > 1) {
					return 0;
				}
			}
		}

		Arrays.sort(count);

		return count[0] == 0 ? 0 : 1;
		
		// Another way
		/*Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				return 0;
			}
		}

		return 1;*/
	}
}
