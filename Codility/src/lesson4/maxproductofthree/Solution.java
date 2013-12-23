package lesson4.maxproductofthree;

import java.util.Arrays;

class Solution {
	public int solution(int[] A) {
		int N = A.length;

		Arrays.sort(A);

		int right = A[N - 1] * A[N - 2] * A[N - 3];
		int left = A[N - 1] * A[0] * A[1];

		return left > right ? left : right;
	}
}
