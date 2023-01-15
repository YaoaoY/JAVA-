/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: `
 * Date: 2023-01-15
 * Time: 21:48
 */
public class TestDemo {
    public static void main(String[] args) {
        int sum=0;
        int ret=1;
        for (int i = 1; i < 5; i++) {
            ret*=i;
            sum+=ret;
            System.out.println(ret);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        int i=0;
        while (i<=100){
            if(i%15!=0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
