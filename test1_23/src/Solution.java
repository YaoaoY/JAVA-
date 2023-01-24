/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-23
 * Time: 16:50
 */
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;//因为nums.length可能为答案
        while (left < right) {
            int mid = left + (right - left) / 2;//防止溢出（但其实left和right表示数组小标没什么必要）
            if (target < nums[mid]) {
                right = mid - 1;//下一次搜索区间为[left,mid-1]
            } else {
                left = mid;//下一次搜素区间为[mid,right]
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int ret = searchInsert(nums, target);
        System.out.println(ret);

    }
}
