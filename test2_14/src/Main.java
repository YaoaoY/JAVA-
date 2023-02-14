import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book10", 12);
        Book book2 = new Book("book100", 1);
        Book book3 = new Book("book", 50);
        Book book4 = new Book("boo", 23);
        Book[] books = {book1, book2, book3, book4};
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.name.length() - o2.name.length();
            }
        });
        for (Book book : books) {
            System.out.println(book.name);
        }
    }
}

class Book {
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
}