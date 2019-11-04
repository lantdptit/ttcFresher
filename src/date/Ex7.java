package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex7 {
    public static Date stringtodate (String string, SimpleDateFormat format) throws Exception{
        Date date = format.parse(string);
        return date;
    }
    static void changetheformat (String string, SimpleDateFormat format) throws Exception {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("MMM yyyy,dd HH:mm:ss");
        Date date = stringtodate(string, format);
        String s1 = format1.format(date);
        String s2 = format2.format(date);

        System.out.println("Dinh dang yyyy-MM-dd HH:mm:ss: "+s1);
        System.out.println("Dinh dang MMM yyyy,dd HH:mm:ss: "+s2);
    }


    public static void main(String[] args) throws Exception{
        Scanner sr= new Scanner(System.in);
        System.out.println("Nhap ngay dang: yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String stringtodate = sr.nextLine();
        changetheformat(stringtodate,format);

    }
}
