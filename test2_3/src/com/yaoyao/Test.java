package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-03
 * Time: 17:02
 */
public class Test {
}

class Cat {
    private String name;
    //在类的内部创建对象
    private static Cat cat;

    //构造器私有化
    private Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //公开的获取实例的方法
    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("yaoyao");
        }
        return cat;
    }
}

class Cat1 {
    private String name;
    //在类的内部创建对象
    private static Cat1 cat = new Cat1("yaoyao");

    //构造器私有化
    private Cat1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //公开的获取实例的方法
    public static Cat1 getInstance() {
        return cat;
    }
}
