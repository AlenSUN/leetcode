// dynamic programming, use caching
public class NumArray {
	private int[] sums;

	public NumArray(int[] nums) {
		int l = nums.length;
		if (l > 0) {
			sums = new int[l];
			sums[0] = nums[0];
			for (int i = 1; i < l; i++)
				sums[i] = sums[i - 1] + nums[i];
		}
	}

	public int sumRange(int i, int j) {
		return i == 0 ? sums[j] : sums[j] - sums[i - 1];
	}
}

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);