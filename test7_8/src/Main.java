import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {

    public static int max1(int a, int b) {
        return a > b ? a : b;
    }

    public static double max1(double x, double y, double z) {
        double t = x > y ? x : y;
        return t > z ? t : z;
    }

    public static void main(String[] args) {
        //求两个整数的最大值和三个小数的最大值
        int a = 1, b = 3;
        double x = 0.1, y = 0.2, z = 0.3;
        System.out.println("a:" + a + "b：" + b + "最大值" + max1(a, b));
        System.out.println("x:" + x + "y" + y + "z" + z + "最大值" + max1(x, y, z));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double x, double y, double z) {
        return x + y + z;

    }

    //求和的重载，求两个整数和三个小数的和
    public static void main6(String[] args) {
        int a = 1, b = 2;
        double x = 0.1, y = 0.2, z = 0.3;
        System.out.println("a+b=" + add(a, b));
        System.out.println("x+y+z=" + add(x, y, z));
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    //求斐波那契数列
    public static void main5(String[] args) {
        int n = 3;
        System.out.println(fib(3));
    }

    public static int fac(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    //求N的阶乘
    public static void main4(String[] args) {
        int n = 5;
        //System.out.println(fac(n));
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        System.out.println(sum);
    }

    public static int max2(int x, int y) {
        return x - y > 0 ? x : y;
    }

    public static int max3(int x, int y, int z) {
        int t = max2(x, y);
        return t - z > 0 ? t : z;
    }

    public static void main3(String[] args) {
//        创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//
//​      要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
        int x = 1, y = 2, z = 3;
        System.out.println(max2(x, y));
        System.out.println(max3(x, y, z));
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int num = in.nextInt();
            //num行
            for (int i = 1; i <= num; i++) {
                //num列
                for (int j = 1; j <= num; j++) {
                    if (j == i || j + i == num + 1) {
                        System.out.print("*");
                        continue;
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void main1(String[] args) {
//        计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double sum = 0;
        for (double i = 1; i <= 100; i++) {
            int flag = i % 2 == 1 ? 1 : -1;
            sum += flag * (1 / i);
        }
        System.out.println(sum);
    }
}