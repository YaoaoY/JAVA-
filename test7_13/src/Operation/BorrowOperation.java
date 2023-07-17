package Operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要借阅的图书的名字:");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getBookNum(); i++) {
            Book book = bookList.getBookByIndex(i);
            if (name.equals(book.getName()) && !book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }

        }
        System.out.println("借阅失败！");
    }
}
