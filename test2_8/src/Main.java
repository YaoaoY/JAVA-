/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
class Person {
    //实例成员变量
    private String name;
    private int age;
    private String sex;
    //静态成员变量
    private static int countNum;

    //静态代码块
    static {
        countNum = 0;
        System.out.println("countNum初始化完毕");
    }

    //构造代码块
    {
        this.name = "yaoyao";
        this.age = 18;
        this.sex = "female";
    }

    public Person(String name, int age, String sex) {
        //super
        //调用本类的构造代码块
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}