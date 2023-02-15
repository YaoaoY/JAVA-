package com.yaoyao;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-02-15
 * Time: 11:59
 */
public class HomeWork {
    public static void main(String[] args) {
        String str = "abcdef";//反转成aedcbf
        System.out.println(strReverse(str, 1, 4));
        String name = "yaoyao8";
        String pwd = "12356";
        String email = "30512@qq.com";

        try {
            userRegister(name, pwd, email);
            System.out.println("恭喜你，注册成功");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        String str1 = "Huang fu yao";
        printByFormat(str1);
        Map

    }
    public static void printByFormat(String str){
        String[] strings = str.split(" ");
        String newStr = String.format("%s %s .%c",strings[1],strings[2],strings[0].toUpperCase().charAt(0));
        System.out.println(newStr);
    }
    public static void userRegister(String name, String pwd, String email) {
        if (!(name != null && pwd != null && email != null)) {
            throw new RuntimeException("参数不能为空");
        }
        //判断名称
        if (!(name.length() <= 6)) {
            throw new RuntimeException("名称长度不可超过6个字符");
        }
        //判断密码准确性
        isDigit(pwd);
        //判断email
        if(!(email.indexOf('@')>0&&email.indexOf('@')<email.indexOf('.'))){
            throw new RuntimeException("邮箱格式错误");
        }
    }

    public static void isDigit(String str){
        Integer.parseInt(str);
    }

    public static String strReverse(String source, int start, int end) {
        char[] arr = source.toCharArray();
        int left = start;
        int right = end;
        for (; left < right; left++, right--) {
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

        }
        return Arrays.toString(arr);
    }
}
