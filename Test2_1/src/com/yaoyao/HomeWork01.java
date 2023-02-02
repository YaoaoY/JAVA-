package com.yaoyao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-02-01
 * Time: 14:14
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0]= new Person("Yaoyao",11,"学生");
        people[1]=new Person("tom",50,"厨师");
        people[2]=new Person("jack",30,"老板");
        //打印排序之前的对象数组
        printArr(people);
        //使用冒泡排序对数组进行排序
        bubbleSort(people);
        //打印排序之后的数组
        printArr(people);

    }
    public static void bubbleSort(Person[] arr){
        //比的是年龄，排序的是整个对象
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                Person temp = null;
                if(arr[j].getAge()>arr[j+1].getAge()){
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(Person[] people){
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}