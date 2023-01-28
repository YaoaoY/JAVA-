package Polymophic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-28
 * Time: 21:52
 */
public class Manager extends Employee{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public Manager(String name, int age, int salary,int bonus) {
        super(name, age, salary);
        this.bonus=bonus;
    }

    @Override
    public int getAnnual() {
        return super.getAnnual()+bonus;
    }
    public void work(){
        System.out.println("经理" + getName() + "岁数" + getAge() + "正在工作");
    }
}
