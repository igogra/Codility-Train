package lesson4.numberofdiscintersections;

class Solution {
	public int solution(int[] A) {
		int N = A.length;
		int[] left = new int[N];
		int[] right = new int[N];
		int count = 0, pairs = 0;

		for (int i = 0; i < N; i++) {
			left[Math.max(0, i - A[i])]++;
			right[(int) Math.min(N - 1, (long) i + A[i])]++;
		}

		for (int i = 0; i < N; i++) {
			if (left[i] > 0) {
				pairs += count * left[i];
				pairs += left[i] * (left[i] - 1) / 2;
				count += left[i];
			}

			count -= right[i];

			if (pairs > 1e7) {
				return -1;
			}
		}

		return pairs;
	}
}
