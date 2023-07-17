import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println("请选择你的角色：1、管理员   0、普通成员");
        int choice = scanner.nextInt();
        if(choice == 1){
            return new Admin(name);
        }else{
            return new NormalUser(name);
        }

    }
    public static void main(String[] args) {
        //创建一个书架
        BookList bookList = new BookList();
        User user = login();
        while (true){
          int choice = user.menu();
          user.doOperation(choice,bookList);
        }
    }
}