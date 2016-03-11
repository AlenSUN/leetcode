public class Solution {
	public int removeElement(int[] nums, int val) {
		int l = nums.length;
		int num = 0;
		int j = l;
		for (int i = 0; i < l; i++)
			if (nums[i] == val)
				num++;
		for (int i = 0; i < l - num; i++)
			if (nums[i] == val)
				for (j--; j >= l - num; j--)
					if (nums[j] != val) {
						nums[i] = nums[j];
						break;
					}
		return l - num;
	}
}