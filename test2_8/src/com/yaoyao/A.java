package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-08
 * Time: 11:06
 */
public class A {
    static {
        System.out.println("A类静态代码块被执行");
    }

    {
        System.out.println("A类构造代码块被执行");
    }

    public A() {
        //super();
        //调用A类普通代码块
        System.out.println("A类构造方法被调用");
    }
}
