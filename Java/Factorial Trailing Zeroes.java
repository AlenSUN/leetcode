public class Solution {
	public int trailingZeroes(int n) {
		int f = 0;
		for (long i = 5; i <= n; i *= 5)
			f += n / i;
		return f;
	}
}