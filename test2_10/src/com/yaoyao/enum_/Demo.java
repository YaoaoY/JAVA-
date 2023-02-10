package com.yaoyao.enum_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-02-10
 * Time: 13:58
 */
public class Demo {
    public static void main(String[] args) {
        //Season spring = new Season("春天", "万物复苏");
        //Season winter = new Season("冬天", "寒风刺骨");
        //Season spring = Season.SPRING;
        Season[] seasons = Season.values();
        for (Season season:seasons) {
            System.out.println(season.name());
        }
    }
}
