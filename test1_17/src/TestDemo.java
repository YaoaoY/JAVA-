import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-17
 * Time: 10:09
 */
public class TestDemo {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main11(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        String strArr = Arrays.deepToString(arr);
        System.out.println(strArr);
    }

    public static void main10(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int[] ret : arr) {
            for (int x : ret) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main9(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }

    //数组的拷贝
    public static void main8(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }

    //数组奇数放前名，偶数放后面
    public static void method(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (arr[l] % 2 == 1 && l < r) {
                l++;
            }
            while (arr[r] % 2 == 0 && r > l) {
                r--;
            }
            int temp = 0;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
    }

    public static void main7(String[] args) {
        int[] arr = {2, 4, 6, 1, 3, 7};
        method(arr);
        System.out.println(Arrays.toString(arr));
    }

    //数组逆序
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        int temp = 0;
        while (left < right) {
            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        return;
    }

    public static void main6(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }
        }
    }

    public static void main5(String[] args) {
        int[] arr = {5, 4, 2, 1, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //检查数组有序性
    public static boolean isUp(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main4(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 2};
        boolean ret = isUp(arr);
        System.out.println(ret);
    }

    public static String myToString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i == arr.length - 1) {
                return ret + "]";
            }
            ret += ",";
        }
        return ret + "]";
    }

    public static void main3(String[] args) {
        String ret = myToString(new int[]{1, 2, 3, 4, 5});
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = Arrays.toString(arr);
        System.out.println(str);
    }

    public static void move(char pos1, char pos2) {
        System.out.println(pos1 + "--->" + pos2);
    }

    /**
     * @param n    盘子个数
     * @param pos1 盘子所放的起始位置
     * @param pos2 盘子移动所借助的中间柱子
     * @param pos3 盘子的目标位置
     */
    public static void hanoiTower(int n, char pos1, char pos2, char pos3) {
        if (n == 1) {
            move(pos1, pos3);
        } else {
            hanoiTower(n - 1, pos1, pos3, pos2);
            move(pos1, pos2);
            hanoiTower(n - 1, pos2, pos1, pos3);
        }
    }

    public static void main1(String[] args) {
        hanoiTower(3, 'a', 'b', 'c');

    }
}
