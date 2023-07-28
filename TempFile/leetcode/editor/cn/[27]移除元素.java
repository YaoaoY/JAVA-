
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while (left <= right && right < nums.length) {
//           while (right < nums.length && nums[right]!=val){
//               nums[left++] = nums[right];
//               right++;
//           }
            if (nums[right] != val) {
                nums[left++] = nums[right];
                right++;
            } else {
                right++;
            }

        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
