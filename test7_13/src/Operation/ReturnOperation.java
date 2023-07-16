package Operation;

import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-07-13
 * Time: 20:38
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想归还图书的名字：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getBookNum(); i++) {
            if (name.equals(bookList.getBookByIndex(i).getName())){
                bookList.getBookByIndex(i).setBorrowed(false);
                System.out.println("归还图书成功！");
                return;
            }
        }
        System.out.println("找不到该图书！");
        return;
    }
}
