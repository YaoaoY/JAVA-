package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-04
 * Time: 23:56
 */
public class Grand {
    {
        System.out.println("爷爷的普通代码块被调用");
    }

    public Grand() {
        //super()
        //调用本类的普通代码块
        System.out.println("爷爷的构造器被调用");
    }
}
