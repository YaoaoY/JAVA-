package Polymophic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-28
 * Time: 21:52
 */
public class Worker extends Employee{
    public Worker(String name, int age, int salary) {
        super(name, age, salary);
    }
    public void Work(){
        System.out.println("普通员工" + getName() + "岁数" + getAge() + "正在工作");
    }
}
