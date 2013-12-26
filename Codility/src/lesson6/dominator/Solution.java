package lesson6.dominator;

import java.util.Stack;

class Solution {
	public int solution(int[] A) {
		int N = A.length;
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			if (stack.size() == 0) {
				stack.push(A[i]);
			} else {
				if (stack.peek() != A[i]) {
					stack.pop();
				} else {
					stack.push(A[i]);
				}
			}
		}

		int candidate = -1;

		if (stack.size() > 0) {
			candidate = stack.peek();
		}

		int posLeader = -1;
		int count = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] == candidate) {
				count++;
				posLeader = i;
			}
		}

		if (count <= N / 2) {
			posLeader = -1;
		}

		return posLeader;
	}
}
