package lesson2.frogriverone;

class Solution {
	public int solution(int X, int[] A) {
		int[] count = new int[X];
		int jumps = 0;
		int K = 0; // time

		while (jumps < X && K < A.length) {
			if (++count[A[K] - 1] == 1) {
				jumps++;
			}
			
			K++;
		}

		if (jumps < X) {
			return -1;
		}

		return K - 1;
	}
}
