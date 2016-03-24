public class Solution {
	public int reverse(int x) {
		boolean negative = false;
		if (x < 0) {
			x = -x;
			negative = true;
		}
		String s = String.valueOf(x);
		int l = s.length();
		char[] r = new char[l];
		for (int i = 0; i < l; i++)
			r[l - i - 1] = s.charAt(i);
		int y;
		try {
			y = Integer.valueOf(String.valueOf(r));
		} catch (Exception e) {
			y = 0;
		}
		return negative ? -y : y;
	}
}