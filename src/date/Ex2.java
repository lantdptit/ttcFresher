package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Ex2 {
    public static Date stringtodate (String string, SimpleDateFormat format) throws Exception{
        Date date = format.parse(string);
        return date;
    }
    static Calendar dateToCalendar (Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
    static LocalDate dateToLocalDate(Date date){
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    static Date calendarToDate(Calendar calendar){
        return calendar.getTime();
    }

    public static void dayofmonth(String string, SimpleDateFormat format) throws Exception{
        Date date = stringtodate(string,format);
        Calendar calendar = dateToCalendar(date);
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy/MM/dd");
        LocalDate localDate = dateToLocalDate(date);
        System.out.println("Ngay dau tien cua thang: "+localDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("Ngay cuoi cung cua thang: "+localDate.with(TemporalAdjusters.lastDayOfMonth()));
//        LocalDate zdt;
//        ZonedDateTime firstOfWeek =zdt.with(ChronoField.DAY_OF_WEEK , 1);
//        ZoneId zoneId;
//        firstOfWeek = firstOfWeek.toLocalDate ().atStartOfDay ( zoneId );
//        ZonedDateTime firstOfNextWeek = firstOfWeek.plusWeeks ( 1 );

        calendar.set(7, calendar.getFirstDayOfWeek());
        System.out.println("Ngay dau tien cua tuan: "+format0.format(calendar.getTime()));
        calendar.add(Calendar.DATE, 100);
        Date datefromcalendar = calendarToDate(calendar);
        String stringDate = format.format(datefromcalendar);
        System.out.println("100 ngay sau: "+stringDate);

    }

    public static void main(String[] args)  throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay dang: yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd");
        String string = sc.nextLine();
        //System.out.println(stringtodate(string, format));
        dayofmonth(string,format0);

    }
}

