import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] ans = new int[nums.length];
        for (int i = k; i < nums.length; i++) {
            ans[i] = nums[i - k];
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            ans[i - nums.length + k] = nums[i];
        }
        //System.out.println(Arrays.toString(ans));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
