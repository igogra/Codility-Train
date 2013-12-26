package lesson6.equileader;

class Solution {
	public int solution(int[] A) {
		int N = A.length;
		int leader = A[0];
		int count = 1;

		for (int i = 1; i < N; i++) {
			if (A[i] == leader) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				leader = A[i];
				count++;
			}
		}

		int totalOccurrences = 0;

		for (int candidate : A) {
			if (candidate == leader) {
				totalOccurrences++;
			}
		}

		int leadersLeft = 0, leadersRight = 0, equiLeaders = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] == leader) {
				leadersLeft++;
			}

			leadersRight = (totalOccurrences - leadersLeft);

			if (leadersLeft > (i + 1) / 2 && leadersRight > (N - 1 - i) / 2) {
				equiLeaders++;
			}
		}

		return equiLeaders;
	}
}
