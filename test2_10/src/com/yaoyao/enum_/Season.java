package com.yaoyao.enum_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-02-10
 * Time: 13:59
 */
public enum Season {
    SPRING(), SUMMER(), AUTUMN(), WINTER();

    //私有化构造器，防止该类实例化（保证该类实例的有限性）

    //只保留getter方法，保证属性只可读，不可外界随便修改

}
