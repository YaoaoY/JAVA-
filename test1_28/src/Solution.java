/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-28
 * Time: 11:49
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] == val) {
                continue;//快指针遇到目标元素，即跳过
            }
            nums[slowIndex++] = nums[fastIndex];
        }
        return slowIndex;
    }
}

class Solution1 {
    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        for (int quickIndex = 0; quickIndex < nums.length; quickIndex++) {
            if (quickIndex > 0 && nums[quickIndex] == nums[quickIndex - 1]) {
                continue;
            }
            nums[slowIndex++] = nums[quickIndex];
        }
        return slowIndex;
    }
}