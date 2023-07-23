
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toLowerCase(String s) {
        char[] buf = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c += 32;
            }
            buf[i] = c;
        }
        return new String(buf);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
