public class Solution {
	public boolean isPowerOfTwo(int n) {
		return n > 0 && hammingWeight(n) == 1;
	}

	public int hammingWeight(int n) {
		int hw = 0;
		while (n != 0) {
			if ((n & 1) == 1)
				hw++;
			n >>>= 1;
		}
		return hw;
	}
}