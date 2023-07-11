/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + "eating");
    }
}


class Cat extends Animal {
    String name;
    int age;

    public Cat(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + "吃小鱼干~");
    }
}

class Parent {
    public Parent() {
        func();
    }

    public void func() {
        System.out.println("parent.func()");
    }
}

class Child extends Parent {
    private final int num = 1;

    public void func() {
        System.out.println("child.func()" + num);
    }
}

class Dog extends Animal {
    String name;
    int age;

    public Dog(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + "吃骨头~");
    }
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}