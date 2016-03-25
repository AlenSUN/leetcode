public class Solution {
	public int myAtoi(String str) {
		str = str.trim();
		int l = str.length();
		for (int i = 0; i < l; i++)
			if (!Character.isDigit(str.charAt(i))) {
				if (i == 0 && str.charAt(i) != '+' && str.charAt(i) != '-')
					return 0;
				if (i > 0) {
					str = str.substring(0, i);
					break;
				}
			}

		long i = 0;
		try {
			i = Long.valueOf(str);
		} catch (Exception e) {

		}

		i = str.length() > 11 ? (str.charAt(0) != '-' ? Integer.MAX_VALUE : Integer.MIN_VALUE) : i;
		return i > Integer.MAX_VALUE ? Integer.MAX_VALUE : (i < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) i);
	}
}