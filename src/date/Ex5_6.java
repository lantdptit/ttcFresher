package date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex5_6 {
    public static Date stringToDate(String stringtodate, SimpleDateFormat format) throws Exception {
        Date date = format.parse(stringtodate);
        return date;
    }

    public static Timestamp stringToTimestamp(String stringtodate, SimpleDateFormat format) throws Exception {
        Date parseDate = format.parse(stringtodate);
        Timestamp timestamp = new Timestamp(parseDate.getTime());
        return timestamp;
    }

    public static String timestampToString (Timestamp timestamp, SimpleDateFormat format) throws Exception {
        Date date = new Date();
        date.setTime(timestamp.getTime());
        String formattedDate = format.format(date);
        return formattedDate;

    }
        public static void main (String[] args) throws Exception{
            Scanner sr = new Scanner(System.in);
            System.out.println("Nhap ngay dang: yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String stringtodate = sr.nextLine();
            //System.out.println(stringToDate(stringtodate, format));
            System.out.println("string To Timestamp: ");
            System.out.println(stringToTimestamp(stringtodate, format));
            System.out.println("Timestamp To String: ");
            Timestamp timestamp = stringToTimestamp(stringtodate, format);
            System.out.println(timestampToString(timestamp,format));

        }
    }
