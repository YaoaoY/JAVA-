
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        if (nums.length == 1) {
            return 1;
        }
        if (nums.length == 0) {
            return 0;
        }
        left = 0;
        right = 1;
        while (left <= right && right < nums.length) {
            if (nums[right] == nums[left]) {
                right++;
            } else {
                nums[++left] = nums[right];
                right++;
            }
        }
        return left+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
