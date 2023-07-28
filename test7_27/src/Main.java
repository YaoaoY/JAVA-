import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        int numRows = 5;
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
        System.out.println(ans);
    }

    public static void main1(String[] args) {
        String str1 = "come on yyz";
        String str2 = "comeyyz";
        StringBuilder ret = new StringBuilder("");
        ArrayList<Character> arrayList1 = new ArrayList<Character>();
        for (int i = 0; i < str1.length(); i++) {
            arrayList1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            Character c = str2.charAt(i);
            if (arrayList1.contains(c)) {
                arrayList1.remove(c);
            }
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            ret.append(arrayList1.get(i));
        }
        System.out.println(ret);
    }
}