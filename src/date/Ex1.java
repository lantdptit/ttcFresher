package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex1 {


    public static Date stringtodate (String string, SimpleDateFormat format) throws Exception{
        Date date = format.parse(string);
        return date;

    }
    public static void main(String[] args) throws Exception {
        Scanner sr= new Scanner(System.in);
        System.out.println("Nhập ngày theo định dạng 'yyyy-MM-dd HH:mm:ss': ");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String string=sr.nextLine();
        System.out.println(stringtodate(string,format));

    }
}
