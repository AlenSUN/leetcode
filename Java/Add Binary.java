public class Solution {
	public String addBinary(String a, String b) {
		int al = a.length();
		int bl = b.length();
		if (bl > al) {
			String tmp = b;
			b = a;
			a = tmp;
		}
		a = "0" + a;
		al = a.length();
		bl = b.length();

		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		for (int i = 0; i < al; i++) {
			if (bl - i - 1 >= 0)
				ac[al - i - 1] += bc[bl - i - 1] - '0';
			if (ac[al - i - 1] >= '2') {
				ac[al - i - 1] -= 2;
				ac[al - i - 2]++;
			}
		}

		String s = String.valueOf(ac);
		if (s.charAt(0) == '0')
			s = s.substring(1);
		return s;
	}
}