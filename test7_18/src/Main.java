import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
class Outer {
    public static void test(final int x, final int y) {
        //父类引用 = new 父类(参数列表）{ 匿名内部类的实现}
        Point p = new Point(2, 3) {
            //计算test方法的(x,y)点到（2,3）点的距离
            @Override
            public double distance(double px, double py) {

                return super.distance(px, py);
            }
        };
        System.out.println(p.distance(x, y));
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.test(3, 3);
//        Arrays.sort();
    }

    public void sortIgnoreCase(String[] strings) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
    }
}