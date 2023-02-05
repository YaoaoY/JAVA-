package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-05
 * Time: 0:03
 */
public class Dad extends Grand{

    public int a=3;
    {
        System.out.println("爸爸的普通代码块被调用");
        System.out.println(a);
    }
    public Dad() {
        //super()
        System.out.println(a);//期待：0
        //本类普通初始化代码
        System.out.println(a);//期待：3
        System.out.println("爸爸的构造器被调用");
    }
}