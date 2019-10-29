package string;

import java.util.*;

public class Ex2 {

    static void demKyTu(String s){
        //ababcbacbabcb
        //arr[0] = a, arr[1]=b;
        String arr[] = s.split("");
//        ArrayList<String> a = new ArrayList<>();
//        List<String> ab = new ArrayList<>();
        //Collections trong java
        //a,b,c,a,b,c,b,a,b,c,a,b,abcbabcbac
        //hs = null;
        //key1 = a; value1 = 1

        HashMap<String, Integer> hs = new HashMap<>();
//        for(int i= 0; i< arr.length; i++)
        for (String x: arr){
            if (hs.containsKey(x)){
                hs.put(x, hs.get(x) + 1);
            }else{
                hs.put(x, 1);
            }
        }
        //lambdas java
        hs.forEach((key, value) -> System.out.println(key + " , " + value));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        char x ;
        System.out.println("Nhap chuoi s: ");
        s = sc.nextLine();
        demKyTu(s);
    }
}
