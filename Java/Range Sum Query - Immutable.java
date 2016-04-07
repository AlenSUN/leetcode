public class NumArray {
	private int[] nums;
	private int[] sums;
	private int sqrt;

	public NumArray(int[] nums) {
		this.nums = nums;
		int l = nums.length;
		if (l == 0)
			return;
		sqrt = (int) Math.sqrt(l);
		sums = new int[l / sqrt + 1];
		int k = 0;
		for (int i = 0; i < l; i += sqrt) {
			int sum = 0;
			for (int j = i; j < i + sqrt && j < l; j++)
				sum += nums[j];
			sums[k++] = sum;
		}
	}

	public int sumRange(int i, int j) {
		if (i / sqrt == j / sqrt) {
			int sum = 0;
			for (int x = i; x <= j; x++)
				sum += nums[x];
			return sum;
		}

		int a = i / sqrt + 1, b = j / sqrt - 1;
		int sum = 0;
		for (int x = a; x <= b; x++)
			sum += sums[x];
		for (int x = i; x < a * sqrt && x < nums.length; x++)
			sum += nums[x];
		for (int x = (b + 1) * sqrt; x <= j; x++)
			sum += nums[x];
		return sum;
	}
}

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);