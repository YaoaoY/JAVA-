package user;

import Operation.IOperation;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-07-13
 * Time: 20:23
 */
public  abstract class User {
    protected String name;
    public abstract int menu();
    protected IOperation[] operations;
    public void doOperation(int choice, BookList bookList){
        operations[choice].work(bookList);
    }
    public User(String name) {
        this.name = name;
    }
}
