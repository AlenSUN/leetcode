// use Moore's voting algorithm
public class Solution {
	public int majorityElement(int[] nums) {
		int maj = nums[0], vote = 1, l = nums.length;
		for (int i = 1; i < l; i++)
			if (vote != 0) {
				if (nums[i] == maj)
					vote++;
				else
					vote--;
			} else {
				maj = nums[i];
				vote = 1;
			}
		return maj;
	}
}