
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !isValidChar(s.charAt(left))) {
                left++;
            }
            while (left < right && !isValidChar(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isValidChar(char c) {
        if (Character.isLetter(c) || Character.isDigit(c)) {
            return true;
        } else {
            return false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
