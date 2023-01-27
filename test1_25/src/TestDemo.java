import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-25
 * Time: 11:26
 */
public class TestDemo {
    public static void main(String[] args) {
        PC pc = new PC("intel", 12, 32, "hh");
        pc.getDetails();
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = arr1;
        arr2 = new char[]{'A', 'B', 'C'};
        System.out.println(Arrays.toString(arr2));
        Math.pow(2, 0.5);
    }
}

class Solution {
    public int mySqrt(int x) {
        //特例判断，因为x/2>=根号x，在x>=2的时候成立
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }

        int left = 0;
        int right = x / 2;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;//防止溢出

            if (mid <= x / mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

