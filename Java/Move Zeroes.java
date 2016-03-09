public class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int pos = -1;
        for (int i = 0; i < l; i++) {
        	if (nums[i] == 0) {
        		for (pos++; pos < l; pos++) {
        		    if (pos < i) {
        		        pos = i;
        		    } else if (nums[pos] != 0) {
        				nums[i] = nums[pos];
        				nums[pos] = 0;
        				break;
        			}
        		}
        	}
        }
    }
}