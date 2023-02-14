package com.yaoyao.stringDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-02-12
 * Time: 12:56
 */
public class Test {
    public static void main(String[] args) {

        Integer[] arr = {8, 6, 3, 2};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer) o1 - (Integer) o2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

}

interface SendMessage {
    default void eat(){
        System.out.println("hh");
    }
    public static final String MSG = "yaoyao";

    public abstract void print();
}

class Computer implements SendMessage, MyCompare {
    String useName;
    int innerStorage;

    @Override
    public void print() {
        System.out.println(this.useName + "正在发送信息：" + MSG);
    }

    @Override
    public int compare(Object otherObj) {
        if (!(otherObj instanceof Computer)) {
            throw new IllegalArgumentException();
        }
        Computer otherCom = (Computer) otherObj;
        return this.innerStorage - otherCom.innerStorage;
    }

    @Override
    public void eat() {
        SendMessage.super.eat();
    }
}

interface MyCompare {
    public int compare(Object otherObj);
    int a;
}
