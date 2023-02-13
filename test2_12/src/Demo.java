/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-02-12
 * Time: 10:38
 */
public class Demo {
    public static void main(String[] args) {
        Integer integer01 = 1;
        Integer integer02 = 1;
        System.out.println(integer01 == integer02);//true

        Integer integer03 = new Integer(1);
        Integer integer04 = new Integer(1);
        System.out.println(integer03 == integer04);//false

        Integer integer05 = 128;
        Integer integer06 = 128;
        System.out.println(integer05 == integer06);//false

        Integer integer07 = 129;
        int i = 129;
        System.out.println(integer07 == i);//true

    }
}
