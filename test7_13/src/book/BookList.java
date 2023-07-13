package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-07-13
 * Time: 20:47
 */
public class BookList {
    private Book[] books = new Book[10];
    private int bookNum = 0;

    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }

    public int getBookNum() {
        return bookNum;
    }
    public Book getBookByIndex(int index){
        return books[index];
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }
    public BookList(){
        books[0] = new Book("红楼梦",12,"小说","曹雪芹");
        books[1] = new Book("三国演义",13,"小说","罗贯中");
        books[2] = new Book("水浒传",14,"小说","施耐庵");
        this.bookNum = 3;
    }
}
