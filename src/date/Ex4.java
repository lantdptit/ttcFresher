package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Ex4 {
    //dùng để xử lý ngày tháng, không có thời gian
    public static LocalDate datenottime (Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    public static void countdate(String date1,String date2, SimpleDateFormat format) throws Exception{
        Date d1 = format.parse(date1);
        Date d2 = format.parse(date2);

        LocalDate start = datenottime(d1);
        LocalDate end   = datenottime(d2);
        Period period = Period.between(start, end);
        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();
        System.out.println(days+" days "+ months + " months "+ years +" years");

    }
    public static void main(String[] args) throws Exception {
        Scanner sr =new Scanner(System.in);
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Nhập ngày a định dạng: yyyy-MM-dd HH:mm:ss");
        String date1=sr.nextLine();
        System.out.println("Nhập ngày b định dạng: yyyy-MM-dd HH:mm:ss");
        String date2=sr.nextLine();
        countdate(date1,date2 ,format);
    }
}
