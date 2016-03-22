public class Solution {
	public int romanToInt(String s) {
		int l = s.length(), r = 0;
		for (int i = 0; i < l; i++) {
			switch (s.charAt(i)) {
			case 'I':
				if (i + 1 < l && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
					r -= 1;
				else
					r += 1;
				break;

			case 'V':
				r += 5;
				break;

			case 'X':
				if (i + 1 < l && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
					r -= 10;
				else
					r += 10;
				break;

			case 'L':
				r += 50;
				break;

			case 'C':
				if (i + 1 < l && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
					r -= 100;
				else
					r += 100;
				break;

			case 'D':
				r += 500;
				break;

			case 'M':
				r += 1000;
				break;

			default:
				break;
			}
		}
		return r;
	}
}