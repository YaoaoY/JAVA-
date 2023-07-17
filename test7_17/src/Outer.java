/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-07-17
 * Time: 19:30
 */
public class Outer {
    public static int a;

    public static class StaticInner {
        public void method() {
            System.out.println(a);
        }
    }

}

class OutClass {
    int a = 10;

    public void method() {
        int b = 0;
        class InnerClass {
            public void method() {
                System.out.println(a);
                System.out.println(b);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.method();
    }

}

