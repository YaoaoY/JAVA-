package com.yaoyao;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-02-15
 * Time: 23:26
 */
public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i <= 12; i++) {
            list.add("hello"+i);
        }
        System.out.println(list);
        list.add(2,"yaoyao");
        System.out.println(list.get(5));
        list.remove(6);
        list.set(7,"第七号被修改");
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println(list.get(12));
    }
}
