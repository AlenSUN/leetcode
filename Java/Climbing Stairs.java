public class Solution {
	public int climbStairs(int n) {
		int c = 0;
		for (int i = 0; i <= n / 2; i++)
			c += c(n - i, i);
		return c;
	}

	// c(n, k) = (n(n - 1)...(n - k + 1)) / (k(k - 1)...1)
	private int c(int n, int k) {
		long a = 1;
		for (int i = n - k + 1; i <= n; i++)
			a = a * i / (i - n + k);
		return (int) a;
	}
}