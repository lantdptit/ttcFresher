package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    static String listToString(List<String> listString){
        return String.join(";", listString);
    }

    public static void main(String[] args){
        List<String> listString = new ArrayList<>();
        listString.add("abc");
        listString.add("def");
        String chuoiCanTim = listToString(listString);
        System.out.println(chuoiCanTim);
    }
}
