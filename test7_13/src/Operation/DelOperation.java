package Operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-07-13
 * Time: 20:37
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的图书的名字:");
        for (int i = 0; i < bookList.getBookNum(); i++) {
        String name = scanner.nextLine();
            Book book = bookList.getBookByIndex(i);
            if (name.equals(book.getName())) {
              for(int j = i+1; j < bookList.getBookNum();j++){

              }
            }
        }
        System.out.println("借阅失败！");
    }
}
