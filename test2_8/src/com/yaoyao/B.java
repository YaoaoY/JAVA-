package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-08
 * Time: 11:06
 */
public class B extends A{
    static {
        System.out.println("B类静态代码块被执行");
    }

    {
        System.out.println("B类构造代码块被执行");
    }

    public B() {
        //super();
        //调用A类普通代码块
        System.out.println("B类构造方法被调用");
    }
}
