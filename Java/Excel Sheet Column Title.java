public class Solution {
	public String convertToTitle(int n) {
		String s = new String();
		while (n != 0) {
			s = (char) ((n - 1) % 26 + 'A') + s;
			n = (n - 1) / 26;
		}
		return s;
	}
}