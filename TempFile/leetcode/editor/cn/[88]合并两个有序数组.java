import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        int[] ans = new int[m + n];
        int i = 0;
        while (left < m && right < n && i < m + n) {
            if (nums1[left] <= nums2[right]) {
                ans[i++] = nums1[left];
                left++;
            } else {
                ans[i++] = nums2[right];
                right++;
            }
        }
        while (left < m && i < m + n) {
            ans[i++] = nums1[left++];
        }
        while (right < n && i < m + n) {
            ans[i++] = nums2[right++];
        }
        for (int j = 0; j < m + n; j++) {
            nums1[j] = ans[j];
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
