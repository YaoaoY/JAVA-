/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-07
 * Time: 12:21
 */
public class Animal {
    private int age;
    private String name;

    public void eat() {
        System.out.println("吃东西ing");
    }

    //下面是两个属性的构造器
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
