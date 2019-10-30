package collections;

public class view {
    public static void main(String[] args) {
        controller handler = new controller();
        handler.add();
        System.out.println("Sap xep theo thu tu tang dan Money: ");
        handler.sortByMoney();
        handler.print(handler.bills);
        System.out.println("Ngay lap hoa don: ");
        handler.distinctDate();
        System.out.println("Money > 100000: ");
        handler.print(handler.moreThanOneMillion());
        System.out.println("Hoa don co cung ngay:");
        handler.sameDate();
        System.out.println("Distinct Id and Name: ");
        handler.distinctIdAndName();
    }
}
