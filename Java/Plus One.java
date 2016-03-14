public class Solution {
	public static int[] plusOne(int[] digits) {
		int l = digits.length;
		int i = l - 1;
		digits[i]++;
		while (digits[i] == 10 && i > 0) {
			digits[i] = 0;
			digits[--i]++;
		}
		if (digits[0] == 10) {
			digits = new int[l + 1];
			digits[0] = 1;
			for (i = 1; i < l + 1; i++)
				digits[i] = 0;
		}
		return digits;
	}
}