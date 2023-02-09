package com.yaoyao.Inher;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-08
 * Time: 12:20
 */
public class Father {
    public static int count;
    private int a;

    static {
        System.out.println("Father类的静态初始化代码块被执行");
        count = 1;
    }

    {
        System.out.println("Father类的实例代码块被执行");
        a = 1;
    }

    public Father() {
        System.out.println("Father类的构造器被调用");
        a = 2;
    }

    public static void  enjoy() {
        System.out.println("enjoy smoking");
    }

    public void action() {
        System.out.println("Start");
        System.out.println("Ended");
    }
}
