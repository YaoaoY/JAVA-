/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-26
 * Time: 15:05
 */
class Account {
    private String name;
    private double balance;
    private String pwd;

    //Account类的一个构造器
    public Account(String name, double balance, String pwd) {
        //构造器的实现---初始化对象
        name = name;
        balance = balance;
        pwd = pwd;
    }

    public void showInfo() {
        System.out.println("name:" + name + " " + "balance:" + balance + " " + "pwd:" + pwd);
        return;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Account account = new Account("Yaoyao", 20, "123456");
        account.showInfo();
    }
}
