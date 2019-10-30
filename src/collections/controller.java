package collections;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class controller {
    public ArrayList<Bill> bills;

    public void add(){
        Bill b0 = new Bill(0,"Trần Đức Lân 0", 10000,"2019-10-12");
        Bill b1 = new Bill(1,"Trần Đức Lân 1", 110000,"2019-10-12");
        Bill b2 = new Bill(2,"Trần Đức Lân 2", 120000,"2019-10-14");
        Bill b3 = new Bill(3,"Trần Đức Lân 3", 130000,"2019-10-15");
        Bill b4 = new Bill(4,"Trần Đức Lân 4", 140000,"2019-10-16");
        Bill b5 = new Bill(5,"Trần Đức Lân 5", 150000,"2019-10-17");
        Bill b6 = new Bill(6,"Trần Đức Lân 6", 160000,"2019-10-18");

        bills = new ArrayList<>();
        bills.add(b0);
        bills.add(b1);
        bills.add(b2);
        bills.add(b3);
        bills.add(b4);
        bills.add(b5);
        bills.add(b6);

    }
    public void print(ArrayList<Bill> listOfBills) {
        for (Bill b : listOfBills) {
            System.out.println(b.toString());
        }
    }

    public void sortByMoney() {
        Collections.sort(bills, new MoneyComparator());
    }

    public ArrayList<Bill> moreThanOneMillion() {
        ArrayList<Bill> lists = new ArrayList<>();
        for (Bill b : bills) {
            if (b.getMoney() >= 1000000) {
                lists.add(b);
            }
        }
        return lists;
    }

    public void distinctDate() {
        Set<String> dates = new HashSet<>();
        for (Bill b : bills) {
            dates.add(b.getDate());
        }
        for (String s : dates) {
            System.out.println(s);
        }
    }

    public void distinctIdAndName() {
        Set<Bill> billSet = new HashSet<>(bills);
        for (Bill b : billSet) {
            System.out.println(b);
        }
    }

    public Map<String, List<Bill>> sameDate() {
        List<Bill> listB = null;
//        Map<String, List<String>> has = bills.stream().collect(
//                Collectors.groupingBy(Bill::getDate,
//                        Collectors.mapping(Bill::getName, Collectors.toList()))
//        );
        Map<String, List<Bill>> has = new HashMap<>();
        for (Bill b : bills) {
            if (!has.containsKey(b.getDate())){
                listB = new ArrayList<>();
                listB.add(b);
                has.put(b.getDate(), listB);
            }else{
                List<Bill> temp = has.get(b.getDate());
                temp.add(b);
                has.put(b.getDate(), temp);
            }
        }
        has.forEach((key, value) -> System.out.println(key + " - " + value));
        return has;
    }

    public class MoneyComparator implements Comparator<Bill> {
        @Override
        public int compare(Bill b1, Bill b2) {
            if (b1.getMoney() == b2.getMoney()) {
                return 0;
            } else if (b1.getMoney() > b2.getMoney()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
