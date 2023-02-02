package com.yaoyao.house_rent.domain;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-02
 * Time: 22:02
 */
public class House {
    private int id;
    private String holderName;
    private String holderPhone;
    private String address;
    private int monthlyRent;
    private String rentState;

    public House(String holderName, String holderPhone, String address, int monthlyRent, String rentState) {
        this.holderName = holderName;
        this.holderPhone = holderPhone;
        this.address = address;
        this.monthlyRent = monthlyRent;
        this.rentState = rentState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderPhone() {
        return holderPhone;
    }

    public void setHolderPhone(String holderPhone) {
        this.holderPhone = holderPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(int monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getRentState() {
        return rentState;
    }

    public void setRentState(String rentState) {
        this.rentState = rentState;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + holderName +
                "\t" + holderPhone +
                "\t\t" + address +
                "\t" + monthlyRent +
                "\t" + rentState ;
    }
}
