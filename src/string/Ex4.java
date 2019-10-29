package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    static List<String> stringToList(String s){
        List<String> listString = new ArrayList<>();
        String array[] = s.split(",");
//        for(int i= 0; i< array.length; i++){
////            listString.add(array[i]);
////        }
        listString = Arrays.asList(array);
        return listString;
    }
    public static void main(String[] args) {
        String s = "abc,def,ghjk";
        List<String> listString = stringToList(s);
        for (String s1: listString){
            System.out.println(s1);
        }
    }
}
