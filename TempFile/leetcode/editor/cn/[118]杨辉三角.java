import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //int numRows = 5;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            //依次存储每一行
            List<Integer> row = new ArrayList<>();
            //每一个元素坐标是ai,j
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);//第一个元素总是1,对角线元素也总是i
                    continue;
                }
                //a(i-1,j),a(i-1,j-1)
                if (i > 0) {
                    int a = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                    row.add(a);
                }

            }
            ans.add(row);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
