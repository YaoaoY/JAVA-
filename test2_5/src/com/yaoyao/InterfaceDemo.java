package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-05
 * Time: 20:35
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        fun(mysqlDB);
    }
    public static void fun(DBInterface db){
        db.connect();
        db.close();
    }
}
