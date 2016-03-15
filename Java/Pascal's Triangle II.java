public class Solution {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < rowIndex + 1; i++)
			l.add(c(rowIndex, i));
		return l;
	}

	// c(n, k) = n(n - 1)...(n - k + 1) / k(k - 1)...1
	private int c(int n, int k) {
		if (k > n / 2)
			return c(n, n - k);

		long a = 1;
		for (int i = n - k + 1; i <= n; i++)
			a = a * i / (i - n + k);
		return (int) a;
	}
}