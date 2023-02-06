package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-05
 * Time: 20:40
 */
public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接Oracle数据库");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle数据库连接");
    }
}
