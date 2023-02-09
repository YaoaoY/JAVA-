package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-08
 * Time: 11:10
 */
public class Test {
    public static void main(String[] args) {
        C c = new C();
        //A类静态代码块被执行
        //B类静态代码块被执行
        //C类静态代码块被执行
        //A类构造代码块被执行
        //A类构造方法被调用
        //B类构造代码块被执行
        //B的构造方法被调用
        //C类构造代码块被执行
        //C类构造方法被调用
    }
}
