package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex3 {
    public static void soSanh (String date1, String date2, SimpleDateFormat format) throws ParseException {
        Date d1= format.parse(date1);
        Date d2= format.parse(date2);
        if (d1.compareTo(d2)<0){
            System.out.println("date 1 < date 2");
        }else if (d1.compareTo(d2)==0){
            System.out.println("date 1 == date 2");
        }else {
            System.out.println("date1 > date2");
        }

    }
    public static void main(String[] args) throws Exception {
        Scanner sr =new Scanner(System.in);
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Nhập ngày a định dạng: yyyy-MM-dd HH:mm:ss");
        String date1=sr.nextLine();
        System.out.println("Nhập ngày b định dạng: yyyy-MM-dd HH:mm:ss");
        String date2=sr.nextLine();
        soSanh(date1,date2,format);
    }
}
