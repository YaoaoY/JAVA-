/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-05
 * Time: 9:32
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right = 0;
        int left = 0;
        int sum = 0;
        int minSubArrayLen = Integer.MAX_VALUE;
        for (; right < nums.length && left <= right; right++) {
            while (sum >= target && left <= right) {
                minSubArrayLen = Integer.min(minSubArrayLen, right - left + 1);
                sum -= nums[left++];
            }
            sum += nums[right];//主体部分
        }
        return minSubArrayLen;
    }
}
