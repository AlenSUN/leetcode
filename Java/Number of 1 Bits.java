public class Solution {
	// you need to treat n as an unsigned value
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