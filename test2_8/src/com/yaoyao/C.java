package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-08
 * Time: 11:06
 */
public class C extends B{
    static {
        System.out.println("C类静态代码块被执行");
    }

    {
        System.out.println("C类构造代码块被执行");
    }

    public C() {
        //super();
        //调用A类普通代码块
        System.out.println("C类构造方法被调用");
    }
}
