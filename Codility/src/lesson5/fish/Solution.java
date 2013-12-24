package lesson5.fish;

import java.util.Stack;

class Solution {
	public int solution(int[] A, int[] B) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < A.length; i++) {
			if (stack.isEmpty()) {
				stack.push(i);
			} else {
				while (!stack.isEmpty() && B[stack.peek()] == 1 && B[i] == 0 && A[stack.peek()] < A[i]) {
					stack.pop();
				}
				if (!stack.empty()) {
					if (B[stack.peek()] != 1 || B[i] != 0) {
						stack.push(i);
					}
				} else {
					stack.push(i);
				}
			}
		}

		return stack.size();
	}
}
