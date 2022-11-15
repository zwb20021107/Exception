import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo {
    public static void main(String[] args) throws ParseException {
//        //运行时异常
//        int[] arr = {1, 2, 3};
//        System.out.println(arr[3]);

        //编译时异常
        String s = "2048-08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
