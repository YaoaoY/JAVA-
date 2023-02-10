package com.yaoyao.Inter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-09
 * Time: 15:22
 */
public class Demo {
    public static void main(String[] args) {
        B b = new Son();
        A a = new Son();
    }
}

interface A {
}

interface B extends A {
}

class Son implements B {

}

class Outer {
    class Inner {
    }

    public Inner getInner() {
        return new Inner();
    }
}