/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */

public class Main {
    public static void main(String[] args) {
        //演示int&Integer之间的转换
        //一、JDK5以前：手动装箱
        //1.1：
        int num = 0;
        Integer integer01 = new Integer(num);
        //1.2:
        Integer integer02 = Integer.valueOf(num);
        //二：JDK5以前：手动拆箱
        int i = integer01.intValue();

        //三：JDK５以后：自动装箱；底层使用Integer.valueOf(3);
        Integer integer03 = 3;
        //自动拆箱;底层使用integer03.intValue()
        int j = integer03;

        Integer integer04 = 4;
        //String str = String.valueOf(integer04);

        String str = "123";
        //涉及到了自动装箱
        Integer integer05 = Integer.parseInt(str);
        Integer integer06 = new Integer("123");

    }
}