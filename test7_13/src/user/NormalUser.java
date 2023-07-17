package user;

import Operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        operations = new IOperation[] {new ExitOperation(),new FindOperation(),new BorrowOperation(),new ReturnOperation()};
    }

    @Override
    public int menu() {
        System.out.println("*********************************");
        System.out.println("Hello:"+name+" 欢迎来到图书管理系统！");
        System.out.println("1、查询图书");
        System.out.println("2、借阅图书");
        System.out.println("3、归还图书图书");
        System.out.println("0、退出系统");
        System.out.print("请输入你的选择：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
