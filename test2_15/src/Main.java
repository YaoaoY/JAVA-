import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        //把一个Date类转换成格式需求的字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //把字符串转成对应格式的date输出（注意，使用的SimpleDateFormat对象的parse(String source)f方法时，字符串必须和该对象创建时初始化的那个格式一样

        Date date1 = simpleDateFormat.parse(format);
        //但是该日期还是按照国外日期格式打印（Date类对象本身的toString 方法没有改变）
        System.out.println(date1);
        //再次使用formate方法
        System.out.println(simpleDateFormat.format(date1));
    }
}