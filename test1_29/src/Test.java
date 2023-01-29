import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-28
 * Time: 22:46
 */
class A{
}
class B extends A{

}
public class Test {
    public static void main(String[] args) {
        Integer integer01 = new Integer(123);
        Integer integer02 = new Integer(123);
        System.out.println(integer01 == integer02);//false
        System.out.println(integer01.equals(integer02));//true

        Integer integer03 = new Integer(1234);
        Integer integer04 = new Integer(1234);
        System.out.println(integer03 == integer04);//false（因为在堆内存中地址不同）
        System.out.println(integer03.equals(integer04));//true

        Integer integer05 = 123;
        Integer integer06 = 123;
        System.out.println(integer05 == integer06);//true
        System.out.println(integer05.equals(integer06));//true

        String str1 = new String("yaoyao");
        String str2 = new String("yaoyao");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

        String str3 = "yaoyao";
        String str4 = "yaoyao";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        //System.out.println("hh" == new Date(1));
        System.out.println(new A() == new B());
    }
}
