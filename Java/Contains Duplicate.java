public class Solution {
	public boolean containsDuplicate(int[] nums) {
		// version 1
//		Set<Integer>[] s = new HashSet[10];
//		for (int i = 0; i < 10; i++)
//			s[i] = new HashSet<>();
//		for (int i = 0; i < nums.length; i++)
//			if (!s[Math.abs(nums[i] % 10)].add(nums[i]))
//				return true;
//		return false;

		// version 2
//		Set<Integer> s = new HashSet<>();
//		for (int i = 0; i < nums.length; i++)
//			if (!s.add(nums[i]))
//				return true;
//		return false;

		// version 3
		Set<Integer> s = new HashSet<>();
		int l = nums.length;
		for (int i = 0; i < l; i++)
			if (!s.add(nums[i]))
				return true;
		return false;
	}
}