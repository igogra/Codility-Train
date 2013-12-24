package lesson5.stonewall;

import java.util.Stack;

class Solution {
	public int solution(int[] H) {
		Stack<Integer> stack = new Stack<Integer>();
		int blocks = 0;

		for (int i = 0; i < H.length; i++) {
			while (!stack.empty() && H[i] < stack.peek()) {
				stack.pop();
			}
			if (stack.empty() || H[i] > stack.peek()) {
				stack.push(H[i]);
				blocks++;
			}
		}

		return blocks;
	}
}
