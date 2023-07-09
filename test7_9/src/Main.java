import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
//    给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,3,7,23,12};
        int count = 0;
        for (int x : arr) {
            if(x%2==1){
                count++;
                if(count == 3){
                    System.out.println(true);
                }
                continue;
            }
            count = 0;//遇到偶数归零
        }
    }
    public static void main8(String[] args) {
//        给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length / 2]);
    }

    public static void main7(String[] args) {
//        给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
        int[] arr = {1, 1, 2, 2, 3};
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans ^= arr[i];
        }
        System.out.println("只出现一次的数字是：" + ans);
    }

    public static void main6(String[] args) {
        int target = 9;
        int[] arr = {2, 7, 11, 15};
        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == target) {
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("[" + x + "," + y + "]");
    }

    public static int doubleSort(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = 0;
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main5(String[] args) {
//        给定一个有序整型数组, 实现二分查找
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        System.out.println("元素2的位置为" + doubleSort(arr, 2));
//        给定一个整型数组, 实现冒泡排序(升序排序)
        int[] arr = {6, 5, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main4(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 1) {
                left++;
            }
            while (arr[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int t = 0;
                t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //    实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void printArray(int[] arr) {
        for (int x :
                arr) {
            System.out.print(x + " ");
        }
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum(int[] arr) {
        int ret = 0;
        for (int x :
                arr) {
            ret += x;
        }
        return ret;
    }

    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static void main3(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
//        printArray(arr);
//        transform(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(sum(arr));
        System.out.println(avg(arr));
    }

    public static void main2(String[] args) {
//        创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //    数组转字符串输出
    public static void myToString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i <= arr.length - 2; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static void main1(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        myToString(arr);
    }
}