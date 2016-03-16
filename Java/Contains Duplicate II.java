public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> s = new HashSet<>();
		int l = nums.length;
		for (int i = 0; i < (k >= l ? l : k + 1); i++)
			if (!s.add(nums[i]))
				return true;
		for (int i = k + 1; i < l; i++) {
			s.remove(nums[i - k - 1]);
			if (!s.add(nums[i]))
				return true;
		}
		return false;
	}
}