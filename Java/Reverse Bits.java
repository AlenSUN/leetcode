public class Solution {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		int r = 0, mask = 1;
		for (int i = 0; i < 31; i++) {
			if ((n & mask) != 0)
				r++;
			r <<= 1;
			mask <<= 1;
		}
		if ((n & mask) != 0)
			r++;
		return r;
	}
}