package Polymophic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-28
 * Time: 21:59
 */
public class Test {
    public static void main(String[] args) {
        Employee employee01 = new Worker("Xiaowang", 18, 200);
        Employee employee02 = new Manager("Tom", 20, 200, 100);
        showInfo(employee01);
        showInfo(employee02);
        testInstance(employee01);
        testInstance(employee02);
    }

    public static void showInfo(Employee e) {
        System.out.println(e.getAnnual());
    }

    public static void testInstance(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).Work();
        } else if (e instanceof Manager) {
            ((Manager) e).work();
        }
    }

}
