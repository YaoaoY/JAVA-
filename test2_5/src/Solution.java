import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-05
 * Time: 9:32
 */
class Solution1 {
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

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                //左端窗口右移
                map.put(fruits[left], map.get(fruits[left]) - 1);
                //这种类型为空
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
