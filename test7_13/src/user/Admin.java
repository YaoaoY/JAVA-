package user;

import Operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-07-13
 * Time: 20:24
 */
public class Admin extends User{
    public Admin(String name) {
        super(name);
        operations = new IOperation[]{new ExitOperation(),new FindOperation(),new AddOperation(),new DelOperation(),new ShowOperation()};
    }

    @Override
    public int menu() {
        System.out.println("*********************************");
        System.out.println("Hello:"+name+" 欢迎来到图书管理系统");
        System.out.println("1、查询图书");
        System.out.println("2、新增图书");
        System.out.println("3、删除图书");
        System.out.println("4、显示所有图书");
        System.out.println("0、退出系统");
        System.out.println("*********************************");
        System.out.print("请输入你的选择：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
