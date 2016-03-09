public class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int pos = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] == 0) {
                while (pos < l) {
                    if (pos < i) {
                        pos = i + 1;
                    } else if (nums[pos] != 0) {
                        nums[i] = nums[pos];
                        nums[pos++] = 0;
                        break;
                    } else {
                        pos++;
                    }
                }
            }
        }
    }
}