package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-05
 * Time: 0:03
 */
public class Son extends Dad{
    {
        System.out.println("儿子的普通代码块被调用");
    }

    public Son() {
        //super
        //本类的普通代码块
        System.out.println("儿子的构造器被调用");
    }
}