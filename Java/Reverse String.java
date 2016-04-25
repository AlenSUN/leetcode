public class Solution {
	public String reverseString(String s) {
		int l = s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = l - 1; i >= 0; i--)
			sb.append(s.charAt(i));
		return sb.toString();
	}
}