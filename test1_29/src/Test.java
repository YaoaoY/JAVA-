import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-28
 * Time: 22:46
 */
class Person{
    private String name;
    private int age;
//构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class A{
}
class B extends A{

}
public class Test {
    public static void main(String[] args) {
        Integer integer01 = new Integer(123);
        Integer integer02 = new Integer(123);
        System.out.println(integer01 == integer02);//false
        System.out.println(integer01.equals(integer02));//true

        Integer integer03 = new Integer(1234);
        Integer integer04 = new Integer(1234);
        System.out.println(integer03 == integer04);//false（因为在堆内存中地址不同）
        System.out.println(integer03.equals(integer04));//true

        Integer integer05 = 123;
        Integer integer06 = 123;
        System.out.println(integer05 == integer06);//true
        System.out.println(integer05.equals(integer06));//true

        String str1 = new String("yaoyao");
        String str2 = new String("yaoyao");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

        String str3 = "yaoyao";
        String str4 = "yaoyao";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        //System.out.println("hh" == new Date(1));
        //验证==的运算数的限制
        A a = new A();
        B b = new B();
        System.out.println(a == b);

        //哈希值的验证
        System.out.println("a对象的哈希值:"+a.hashCode());
        System.out.println("b对象的哈希值:" + b.hashCode());

        Person person = new Person("yaoyao", 19);
        System.out.println(person);
    }
}
