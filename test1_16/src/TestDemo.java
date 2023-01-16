import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-16
 * Time: 9:22
 */
public class TestDemo {

    //青蛙跳台阶

    //计算数字每一位的和
    public static int counter(int num){
        if(num/10==0){
            return num;
        }
        else{
            return num%10+counter(num/10);
        }
    }
    public static void print(int num){
        if(num/10==0){
            System.out.println(num+" ");
        }
        else {
            print(num/10);
            System.out.println(num%10+" ");
        }
        return;
    }
    //打印数字的每一位
    public static void main(String[] args) {
        print(1234);
        int ret=counter(1234);
        System.out.println("ret="+ret);
    }
    //计算水仙花数
    public static void findNum(int bound){
        for (int i = 0; i <= bound; i++) {
            int count=0;
            int temp=i;
            while(temp!=0){
                count++;
                temp/=10;
            }
            double sum=0;
            temp=i;
            while(temp!=0){
                sum+=Math.pow(temp%10,count);
                temp/=10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }
    }
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bound=scanner.nextInt();
        findNum(bound);
    }
    //计算2个int类型数据相加
    public static int add(int a,int b){
        return a+b;
    }
    //计算2个double类型数据相加
    public static double add(double a,double b){
        return a+b;
    }
    //计算3个int类型数据相加
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main9(String[] args) {
        System.out.println(add(1,2,3));
    }
    //1-100个数字出现了多少个9
    public static void main8(String[] args) {
        int count=0;
        for (int i = 1; i < 100 ; i++) {
            if(i%10==9){
                System.out.println(i);
                count++;
            }
            if(i/10==9){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
    //计算
    public static void main7(String[] args) {
        double sum=0;
        int sign=1;
        for (int i = 1; i <= 100 ; i++) {
            sum+=1.0/i*sign;
            sign*=-1;
        }
        System.out.println(sum);
    }
    //求两个整数的最大公约数
    public static void main6(String[] args) {
        int a=24;
        int b=18;
        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        System.out.println("最大公约数是："+b);
    }

    //打印乘法口诀表
    public static void main5(String[] args) {
        for(int i=1;i<= 9;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+j*i+"  ");
            }
            System.out.println();
        }
    }
    //判断闰年：
    public static void main4(String[] args) {
        for (int i = 1000; i < 2000 ; i++) {
            if((i%4==0&&i%100!=0)||(i%400==0)){
                System.out.println(i+":是闰年");
            }
        }
    }
    public static void main3(String[] args) {
        //生成随机数
        Random random=new Random();
        int rand= random.nextInt(100);//[0,100)

        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请入你想要猜的数字：");
            int num=scanner.nextInt();
            if(num==rand){
                System.out.println("恭喜你，猜对了");
                break;
            }
            else if(num>rand){
                System.out.println("猜大了");
            }
            else{
                System.out.println("猜小了");
            }
        }

    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a);
        }
    }

    public static void main1(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String str = scaner.next();
        System.out.println(str);
    }
}
