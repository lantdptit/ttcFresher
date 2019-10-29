package string;

import java.util.Scanner;
public class Ex1 {

    static void dem(String s, char x, int n){
        int dem = 0;
        for (int i = 0; i< s.length(); i++){
            if (s.charAt(i) == x){
                dem ++;
            }
        }
        System.out.println("So lan xh: "+dem);
        System.out.println("Vi tri dau tien: "+ s.indexOf(x));
        System.out.println("Vi tri dau tien: "+ s.lastIndexOf(x));
        dem = 0;
        for (int i = 0; i< s.length(); i++){
            if (s.charAt(i) == x){
                dem ++;
            }
            if (dem == n){
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        char x ;
        System.out.println("Nhap chuoi s: ");
        s = sc.nextLine();
        // Nhap ky tu a
        System.out.println("Nhap ki tu: ");
        try {
            x = (char)System.in.read();
            System.out.println("Nhap n: ");
            int n = sc.nextInt();
            dem(s, x, n);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
