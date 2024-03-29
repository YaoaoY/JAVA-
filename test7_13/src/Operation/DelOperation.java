package Operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

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
              for( int j = i+1; j < bookList.getBookNum();j++){
                  bookList.setBooks(j-1,bookList.getBookByIndex(j));
              }
                bookList.setBookNum(bookList.getBookNum()-1);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("删除失败！");
    }
}
