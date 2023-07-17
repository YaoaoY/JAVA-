package Operation;

import book.BookList;
public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示所有图书");
        for (int i = 0; i < bookList.getBookNum(); i++) {
            System.out.println(bookList.getBookByIndex(i));
        }
    }
}
