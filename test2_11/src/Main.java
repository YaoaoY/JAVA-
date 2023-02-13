/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(method());

    }

    public static int method() throws NullPointerException,IndexOutOfBoundsException {
        try {
            String[] strs = new String[3];
            //空指针异常
            if (strs[1].equals("hh")) {
                return 1;
            } else {
                //数组越界异常
                strs[3] = "hh";
                return 2;
            }
        } catch (NullPointerException e) {
            return 3;
        } catch (IndexOutOfBoundsException e) {
            return 4;
        } finally {
            return 5;
        }
    }
}