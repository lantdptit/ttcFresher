package collections;

import java.util.Scanner;

public class Ex1 {
    //Do phuc tap cua thuat toan  O(n)
    public static int sum01 (int n){
        int sum =0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

    //Do phuc tap cua thuat toan O(1)
    public static int sum02 (int n){
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap n: ");
            Scanner sr =new Scanner(System.in);
            n=sr.nextInt();
        }
        while (n<=0);
        System.out.println("Tong voi O(n): " +sum01(n));
        System.out.println("Tong voi  O(1): " +sum02(n));
    }

}
