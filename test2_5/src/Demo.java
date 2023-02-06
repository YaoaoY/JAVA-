/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-06
 * Time: 10:45
 */
public class Demo {
    public static void main(String[] args) {
        int[] a={2,21,1,32,23};

        for (int x:arraySort(a)) {
            System.out.println(x);
        }
        int value = getValue(arraySort(a), 0, arraySort(a).length-1, 2);
        System.out.println(value);
    }
    //二分查找
    public static int getValue(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == findVal) {
            return mid;
        } else if (arr[mid] > findVal) {
            return getValue(arr, left, mid - 1, findVal);
        } else {
            return getValue(arr, mid + 1, right, findVal);
        }
    }
    //数组排序
    public static int [] arraySort(int[] values){
        for (int i = 0; i < values.length; i++) {
            int minIndex=i;
            for (int j = i; j < values.length; j++) {
                if(values[j] < values[minIndex]){
                    minIndex=j;
                }
            }
            int temp=values[minIndex];
            values[minIndex] = values[i];
            values[i] = temp;
        }
        return values;
    }
}