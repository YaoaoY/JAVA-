import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        a = Arrays.copyOf(b, a.length);
        System.out.println(Arrays.toString(a));
    }
}

class OutOfCapacityException extends RuntimeException {
    public OutOfCapacityException(String message) {
        super(message);
    }
}

class MyArraylist {

    public int[] elem;
    public int usedSize;//0
    //默认容量
    private static final int DEFAULT_SIZE = 10;

    public MyArraylist() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表:
     * 根据usedSize判断即可
     */
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.println(elem[i] + " ");
        }
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if (isFull()) {
            throw new OutOfCapacityException("数组容量已满！");
        }
        elem[usedSize - 1] = data;
        usedSize++;
    }

    /**
     * 判断当前的顺序表是不是满的！
     *
     * @return true:满   false代表空
     */
    public boolean isFull() {
        if (usedSize >= DEFAULT_SIZE) {
            return true;
        }
        return false;
    }


    private boolean checkPosInAdd(int pos) {
        if (pos >= 0 && pos < usedSize - 1) {
            return true;//合法
        }
        return false;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (checkPosInAdd(pos)) {
            elem[pos] = data;
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        if (checkPosInAdd(pos)) {
            return elem[pos];
        }
    }

    private boolean isEmpty() {
        if (usedSize == 0) {
            return true;
        }
        return false;
    }

    // 给 pos 位置的元素设为【更新为】 value
    public void set(int pos, int value) {
        if (checkPosInAdd(pos)) {
            elem[pos] = value;
        }
    }

    /**
     * 删除第一次出现的关键字key
     *
     * @param key
     */
    public void remove(int key) {
        int index = indexOf(key);
        for (int i = index; i < usedSize - 1; i++) {
            elem[i] = elem[i + 1];
        }
    }

    // 获取顺序表长度
    public int size() {
        return usedSize + 1;
    }

    // 清空顺序表
    public void clear() {
        usedSize = 0;
    }
}