import java.util.Map.Entry;

public class Solution {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> m = new HashMap<>();
		int l = nums.length;
		for (int i = 0; i < l; i++)
			if (m.containsKey(nums[i]))
				m.put(nums[i], m.get(nums[i]) + 1);
			else
				m.put(nums[i], 1);
		Set<Entry<Integer, Integer>> se = m.entrySet();
		Iterator<Entry<Integer, Integer>> i = se.iterator();
		int max = 0, maj = 0;
		while (i.hasNext()) {
			Entry<Integer, Integer> e = i.next();
			if (e.getValue() > max) {
				max = e.getValue();
				maj = e.getKey();
			}
		}
		return maj;
	}
}