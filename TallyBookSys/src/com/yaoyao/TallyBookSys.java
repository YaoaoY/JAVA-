package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-01
 * Time: 12:26
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类，用于完成记账系统的各个功能
 */
public class TallyBookSys {
    //账本持有者姓名
    private String holderName;

    public TallyBookSys(String holderName) {
        this.holderName = holderName;
    }

    //标记变量，看作开关，是否进行
    private boolean flag = true;
    //扫描器，用来接收用户输入信息
    private Scanner scanner = new Scanner(System.in);
    //字符串，用来存储账目明细
    String accountDetails = "----------------------账目明细---------------------";
    //一个用来记录每次收益/花费钱的“临时”变量
    double tempMoney = 0.0;
    //一个临时变量，用来记录每次收益/花钱的信息：如原因/人
    String tempNote = "";
    //结余
    double balance = 0;
    //存储日期
    Date date = new Date();
    //日期格式化
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void menuShow() {
        do {
            System.out.println("----------------------" + holderName + "的私人小账本~---------------------");
            System.out.println("\t\t\t1:查看账目明细");
            System.out.println("\t\t\t2:增加一条收入信息");
            System.out.println("\t\t\t3:增加一条支出信息");
            System.out.println("\t\t\t4:查看当前结余");
            System.out.println("\t\t\t0:退出系统");

            System.out.print("请选择（1~4）：");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(accountDetails);
                    break;
                case 2:
                    this.addIncome();
                    break;
                case 3:
                    this.addExpense();
                case 4:
                    this.showCurrentBalance();
                    break;
                case 0:
                    this.exit();
                    break;
                default:
                    System.out.println("Warning：啊偶，你的输入有误，请重新选择~");
                    break;
            }
        } while (flag);

    }

    public void accountDetails() {
        System.out.println(accountDetails);
    }

    public void addIncome() {
        System.out.println("----------------------收入记录---------------------");
        //本次收益金额
        System.out.print("请输入本次收入金额：");
        tempMoney = scanner.nextDouble();
        if (tempMoney <= 0) {
            System.out.println("金额必须大于0哦~\n请重新选择：");
            return;//结束掉方法
        }
        balance += tempMoney;
        System.out.print("请输入本次收入相关信息/来源：");
        tempNote = scanner.next();
        //账户余额balance加上本次收益金额
        date = new Date();//date变量存储当前日期
        accountDetails += "\n收入信息：" + tempNote + "\t" + "收入金额：+" + tempMoney + "\t收入日期：" + dateFormat.format(date) + "\t结余：" + balance;
    }

    //支出
    public void addExpense() {
        System.out.println("----------------------支出---------------------");
        System.out.print("请输入本次支出金额：");
        tempMoney = scanner.nextDouble();
        //对支出金额的合理性判断：
        if (tempMoney <= 0) {
            System.out.println("金额必须大于0哦~\n请重新选择：");
            return;
        }
        balance -= tempMoney;
        System.out.print("请输入本次支出相关信息：");
        tempNote = scanner.next();
        date = new Date();//date变量存储当前日期
        accountDetails += "\n支出信息：" + tempNote + "\t" + "支出金额：+" + tempMoney + "\t支出日期：" + dateFormat.format(date) + "\t结余：" + balance;
    }

    public void showCurrentBalance() {
        System.out.println("当前结余为：" + balance);
    }

    public void exit() {
        System.out.println("----------------------退出系统---------------------");
        while (true) {
            System.out.print("要确定退出记账小程序了嘛？（Y／N）：");
            String key = scanner.next();
            if (key.equals("Y")) {
                flag = false;
                break;
            } else if (key.equals("N")) {
                break;
            } else {
                System.out.println("你的输入格式有误，请重新输入哦~");
            }
        }
    }
}


