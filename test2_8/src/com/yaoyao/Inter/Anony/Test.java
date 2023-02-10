package com.yaoyao.Inter.Anony;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-09
 * Time: 16:31
 */
public class Test {
    public void method() {
        C c = new C() {

        };
        System.out.println("c对象的实际运行类型为" + c.getClass());
        //底层实现:
        /*
            class Test$1 extends C{

            }
            C c = new Test$1();

         */
    }
}

class C {

}