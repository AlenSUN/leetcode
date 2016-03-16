public class Solution {
	public List<String> summaryRanges(int[] nums) {
		List<String> loS = new ArrayList<>();
		int l = nums.length;
		int f = 0;
		for (int i = 1; i <= l; i++)
			if (i == l || nums[i] - nums[i - 1] != 1) {
				if (i - f == 1)
					loS.add("" + nums[i - 1]);
				else
					loS.add(nums[f] + "->" + nums[i - 1]);
				f = i;
			}
		return loS;
	}
}