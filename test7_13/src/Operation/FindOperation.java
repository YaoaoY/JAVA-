package Operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要查找图书名字：");
        String name = scanner.nextLine();
        for (int i = 0; i <bookList.getBookNum(); i++) {
            Book book = bookList.getBookByIndex(i);
            if(name.equals(book.getName())){
                System.out.println("找到了!");
                System.out.println(book);
                return;
            }
        }
        System.out.println("找不到该书！");
    }
}
