package com.yaoyao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-31
 * Time: 18:17
 */
public class SmallChangeSys01 {
    public static void main(String[] args) {
        boolean flag = true;//标记是否进行
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        //字符串存储明细信息
        String smallChangeDetails = "----------------------零钱通明细---------------------";
        //收益部分所需变量
        double tempMoney = 0.0;//一个用来记录每次收益/花费钱的临时变量
        String tempNote = "";//一个临时变量，用来记录每次收益/花钱的信息：如原因/人
        double balance = 0;//结余
        Date date = new Date();//存储日期
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式化

        do {
            System.out.println("----------------------瑶瑶子的私人小账本~---------------------");
            System.out.println("\t\t\t1:查看账目明细");
            System.out.println("\t\t\t2:增加一条收入信息");
            System.out.println("\t\t\t3:增加一条支出信息");
            System.out.println("\t\t\t4:退出系统");
            System.out.println("\t\t\t5:查看当前结余");
            System.out.print("请选择（1~4）：");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(smallChangeDetails);
                    break;
                case 2:
                    System.out.println("----------------------收入记录---------------------");
                    //本次收益金额
                    System.out.print("请输入本次收入金额：");
                    tempMoney = scanner.nextDouble();
                    if(tempMoney<=0){
                        System.out.println("金额必须大于0哦~\n请重新选择：");
                        break;
                    }
                    balance += tempMoney;
                    System.out.print("请输入本次收入相关信息/来源：");
                    tempNote = scanner.next();
                    //账户余额balance加上本次收益金额
                    date = new Date();//date变量存储当前日期
                    smallChangeDetails += "\n收入信息：" + tempNote + "\t" + "收入金额：+" + tempMoney + "\t收入日期：" + dateFormat.format(date) + "\t结余：" + balance;
                    break;
                case 3:
                    System.out.println("----------------------支出---------------------");
                    System.out.print("请输入本次支出金额：");
                    tempMoney = scanner.nextDouble();
                    //对支出金额的合理性判断：
                    if(tempMoney<=0){
                        System.out.println("金额必须大于0哦~\n请重新选择：");
                        break;
                    }
                    balance -= tempMoney;
                    System.out.print("请输入本次支出相关信息：");
                    tempNote = scanner.next();
                    date = new Date();//date变量存储当前日期
                    smallChangeDetails += "\n支出信息：" + tempNote + "\t" + "支出金额：+" + tempMoney + "\t支出日期：" + dateFormat.format(date) + "\t结余：" + balance;
                    break;
                case 4:
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
                    break;
                default:
                    System.out.println("Warning：啊偶，你的输入有误，请重新选择~");
            }
        } while (flag);
    }
}
