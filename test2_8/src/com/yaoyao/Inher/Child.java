package com.yaoyao.Inher;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-08
 * Time: 12:53
 */
public class Child extends Father {
    public static int count;
    private int a;

    static {
        System.out.println("Child类的静态代码块被调用");
        count = 10;
    }

    {
        System.out.println("Child类的实例代码块被调用");
        a = 10;
    }

    public Child() {
        System.out.println("Child类的构造方法被调用");
        a = 20;
    }

    public static void enjoy() {
        System.out.println("enjoy studying");
    }


}
