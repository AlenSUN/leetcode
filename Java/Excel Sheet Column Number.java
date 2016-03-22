public class Solution {
	public int titleToNumber(String s) {
		int l = s.length(), t = 0;
		for (int i = 0; i < l; i++)
//			t += (s.charAt(i) - 'A' + 1) * (int) Math.pow(26, l - i - 1);
			t = t * 26 + s.charAt(i) - 'A' + 1;
		return t;
	}
}