package user;

import Operation.IOperation;
import book.BookList;

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
