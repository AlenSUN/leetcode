public class Solution {
	public String addBinary(String a, String b) {
		int al = a.length();
		int bl = b.length();
		int cl = al > bl ? al + 1 : bl + 1;
		char[] cc = new char[cl];
		for (int i = 0; i < cl; i++) {
			cc[cl - i - 1] += '0';
			if (al - i - 1 >= 0)
				cc[cl - i - 1] += a.charAt(al - i - 1) - '0';
			if (bl - i - 1 >= 0)
				cc[cl - i - 1] += b.charAt(bl - i - 1) - '0';
			if (cc[cl - i - 1] >= '2') {
				cc[cl - i - 1] -= 2;
				cc[cl - i - 2]++;
			}
		}
		String c = String.valueOf(cc);
		if (c.charAt(0) == '0')
			c = c.substring(1);
		return c;
	}
}