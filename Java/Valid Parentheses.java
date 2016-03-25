public class Solution {
	public boolean isValid(String s) {
		Stack<Character> sk = new Stack<>();
		int l = s.length();
		for (int i = 0; i < l; i++)
			switch (s.charAt(i)) {
			case ')':
				if (!sk.empty() && sk.peek() == '(')
					sk.pop();
				else
					return false;
				break;

			case ']':
				if (!sk.empty() && sk.peek() == '[')
					sk.pop();
				else
					return false;
				break;

			case '}':
				if (!sk.empty() && sk.peek() == '{')
					sk.pop();
				else
					return false;
				break;

			default:
				sk.push(s.charAt(i));
				break;
			}
		return sk.empty();
	}
}