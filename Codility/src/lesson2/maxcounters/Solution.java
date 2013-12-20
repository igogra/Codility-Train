package lesson2.maxcounters;

class Solution {
	public int[] solution(int N, int[] A) {
		int[] count = new int[N];
		int maxValue = 0, lastMaxValue = 0;

		for (int k = 0; k < A.length; k++) {
			if (A[k] <= N) {
				if (count[A[k] - 1] < lastMaxValue) {
					count[A[k] - 1] = lastMaxValue + 1;
				} else {
					count[A[k] - 1]++;
				}

				if (count[A[k] - 1] > maxValue) {
					maxValue = count[A[k] - 1];
				}
			} else {
				lastMaxValue = maxValue;
			}
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] < lastMaxValue) {
				count[i] = lastMaxValue;
			}
		}

		return count;
	}
}
