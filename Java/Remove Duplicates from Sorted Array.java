public class Solution {
	public int removeDuplicates(int[] nums) {
		// version 1
		int l = nums.length;
		int i, j;
		for (i = 0; i < l - 1; i++)
			if (nums[i] == nums[i + 1])
				break;
		for (j = i + 2; j < l; j++)
			if (nums[j] != nums[i])
				nums[++i] = nums[j];
		return ++i;
		
		// version 2
		int l = nums.length;
		int j = 0;
		for (int i = 1; i < l; i++)
			if (nums[i] != nums[j])
				nums[++j] = nums[i];
		return j + 1;
	}
}