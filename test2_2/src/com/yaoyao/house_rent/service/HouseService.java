package com.yaoyao.house_rent.service;

import com.yaoyao.house_rent.domain.House;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-02
 * Time: 21:28
 */
public class HouseService {
    private House[] houses;
    private int houseNumsFlag = 0;
    private int houseIdFlag = 100;//记录当前房屋编号

    //构造器：
    public HouseService(int size) {
        //这里size<0应该抛异常的把，但是还没学到异常，这里暂不考虑
        houses = new House[size];
    }

    //实现真正添加对象的方法
    public boolean add(House newHouse) {
        //判断当前houses数组是否已满（这里规定数组不能扩容）
        if (houseNumsFlag >= houses.length) {
            System.out.println("数组已满，不能再添加");
            return false;
        }
        houses[houseNumsFlag - 1] = newHouse;
        houseNumsFlag++;
        newHouse.setId(++houseIdFlag);
        return true;
    }

    //查找
    public House findById(int id) {
        for (int i = 0; i < houses.length; i++) {
            if (id == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    //删除
    public boolean delById(int id) {
        if (findById(id) == null) {
            return false;
        }
        //寻找待删除房屋对象在数组中的坐标（因为必须通过坐标来删除）
        int delIndex = 0;
        for (int i = 0; i < houses.length; i++) {
            if (id == houses[i].getId()) {
                delIndex = i;
                break;
            }
        }

        for (int i = delIndex; i < houses.length-1; i++) {
            houses[i]=houses[i+1];
        }
        houses[--houseNumsFlag]=null;//删除一个后记得原先最后一个元素置为null，且房屋对象数量减1
        return true;
    }
}
