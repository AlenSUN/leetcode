public class Solution {
	public String countAndSay(int n) {
		String t, r = "1";
		int l;
		for (int i = 1; i < n; i++) {
			l = r.length();
			t = r;
			r = "";
			int no = 1;
			for (int j = 1; j < l; j++)
				if (t.charAt(j) == t.charAt(j - 1)) {
					no++;
				} else {
					r += "" + no + t.charAt(j - 1);
					no = 1;
				}
			r += "" + no + t.charAt(l - 1);
		}
		return r;
	}
}