package lesson5.brackets;

import java.util.Stack;

class Solution {
	public int solution(String S) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < S.length(); i++) {
			char character = S.charAt(i);

			switch (character) {
			case '(':
			case '{':
			case '[':
				stack.push(character);
				break;
			case ')':
				if (stack.empty() || stack.pop() != '(') {
					return 0;
				}
				break;
			case '}':
				if (stack.empty() || stack.pop() != '{') {
					return 0;
				}
				break;
			case ']':
				if (stack.empty() || stack.pop() != '[') {
					return 0;
				}
				break;
			}
		}

		return stack.empty() ? 1 : 0;
	}
}
