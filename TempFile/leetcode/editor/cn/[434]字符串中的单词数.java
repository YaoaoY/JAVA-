
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSegments(String s) {
        int count = 0;

        if (s.equals("")) {
            return 0;
        } else {
            if (s.charAt(0) != ' ') {
                count = 1;
            }
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                    count++;
                }
            }
        }
        return count;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
