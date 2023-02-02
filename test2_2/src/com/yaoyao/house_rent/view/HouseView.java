package com.yaoyao.house_rent.view;

import com.yaoyao.house_rent.domain.House;
import com.yaoyao.house_rent.service.HouseService;
import com.yaoyao.house_rent.utils.Utility;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-02
 * Time: 21:28
 */
public class HouseView {
    private boolean loop = true;
    private HouseService houseService = new HouseService(10);

    public void MainMenu() {
        do {
            System.out.println("\n=========房屋出租系统=========");
            System.out.println("\t\t1.新 增 房 源");
            System.out.println("\t\t2.查 找 房 源");
            System.out.println("\t\t3.删 除 房 屋 信 息");
            System.out.println("\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t5.房 屋 列 表");
            System.out.println("\t\t6.退      出");
            System.out.print("请输入你的选择（1-6）");

            char key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    this.listHouse();
                    break;
                case '6':
                    exit();
                    loop = false;
                    break;
            }
        } while (loop);
    }

    //接收输入
    private void addHouse() {
        System.out.println("====================增加房屋信息====================");
        System.out.print("请输入房屋拥有者姓名:");
        String holderName = Utility.readString(10);
        System.out.print("请输入房屋拥有者电话:");
        String holderPhone = Utility.readString(11);
        System.out.print("请输入此房屋具体地址:");
        String address = Utility.readString(20);
        System.out.print("请输入月租:");
        int monthlyRent = Utility.readInt();
        System.out.print("请输入房屋状态:");
        String rentState = Utility.readString(10);
        House house = new House(holderName, holderPhone, address, monthlyRent, rentState);
        if (houseService.add(house)) {
            System.out.println("添加房屋成功");
        } else {
            System.out.println("添加房屋失败");
        }
    }

    private void findHouse() {
        System.out.println("====================根据房屋ＩＤ查找房屋信息====================");
        System.out.print("请输入你想查询的房屋ID：");
        int id = Utility.readInt();

        House house = houseService.findById(id);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("抱歉，并未找到对应房屋信息!");
        }
    }

    private void delHouse() {
        System.out.println("====================根据房屋ＩＤ删除房屋信息====================");
        int id;
        System.out.print("请输入待删除房屋ID，（-1表示退出）");
        id = Utility.readInt();
        if (id == -1) {
            System.out.println("==========放弃删除操作==============");
            return;
        } else {
            System.out.print("你确定要删除此ID对应房屋信息吗？（Y/N）");
            char choice = Utility.readConfirmSelection();
            if (choice == 'Y') {
                if (houseService.delById(id)) {
                    System.out.println("=========ID为" + id + "房屋信息已经删除成功======");
                } else {
                    System.out.println("=========ID为" + id + "房屋信息不存在，删除失败=====");
                }
            } else {
                System.out.println("==========放弃删除操作==============");
            }
        }
    }

    private void update() {
        System.out.println("====================修改房屋信息====================");
        System.out.print("请选择待修改房屋编号:（-1表示退出）");
        int id = Utility.readInt();
        if (id == -1) {
            System.out.println("==========放弃修改操作==============");
            return;
        }
        House house = houseService.findById(id);
        if (house == null) {
            System.out.println("该房屋不存在");
            return;
        }
        //这里如果用户直接回车表示不修改信息 默认""
        System.out.print("房屋持有者姓名（" + house.getHolderName() + "):");
        String newHolderName = Utility.readString(8, "");
        if (!"".equals(newHolderName)) {
            house.setHolderName(newHolderName);
        }

        System.out.println("房屋持有者电话（" + house.getHolderName() + "):");
        String newHolderPhone = Utility.readString(11, "");
        if (!"".equals(newHolderPhone)) {
            house.setHolderPhone(newHolderPhone);
        }

        System.out.println("房屋地址（" + house.getAddress() + "):");
        String newAddress = Utility.readString(20, "");
        if (!"".equals(newAddress)) {
            house.setAddress(newAddress);
        }

        System.out.println("月租金（" + house.getMonthlyRent() + "):");
        int newMonthlyRent = Utility.readInt(-1);
        if (newMonthlyRent != -1) {
            house.setMonthlyRent(newMonthlyRent);
        }

        System.out.println("房屋当前出租状态（" + "):");
        String newRentState = Utility.readString(10, "");
        if (!newRentState.equals("")) {
            house.setRentState(newRentState);
        }

        System.out.println("===========修改房屋信息成功=========");
    }

    //展示
    private void listHouse() {
        System.out.println("=========房屋列表=========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.getList();
        for (int i = 0; i < houses.length; i++) {
            //保证了输出的都是有效信息
            if(houses[i]==null){
                break;
            }
            System.out.println(houses[i]);
        }
    }
    //退出
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

}
