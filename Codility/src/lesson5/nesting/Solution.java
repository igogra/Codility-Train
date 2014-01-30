package lesson5.nesting;

import java.util.Stack;

class Solution {
	public int solution(String S) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < S.length(); i++) {
			char character = S.charAt(i);

			if (character == '(') {
				stack.push(character);
			} else if (character == ')') {
				if (stack.empty() || stack.pop() != '(') {
					return 0;
				}
			}
		}

		return stack.empty() ? 1 : 0;
	}
}
