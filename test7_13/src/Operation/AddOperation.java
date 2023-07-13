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
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        if(bookList.getBookNum()>10){
            System.out.println("数量已满，无法添加！");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名:");
        String name = scanner.nextLine();
        scanner.nextInt();
        System.out.println("请输入作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书价格：");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入图书类型：");
        String type = scanner.nextLine();
        Book book = new Book(name,price,type,author);
        bookList.setBooks(bookList.getBookNum(),book);
        bookList.setBookNum(bookList.getBookNum()+1);
        System.out.println("新增图书成功！");
    }
}
