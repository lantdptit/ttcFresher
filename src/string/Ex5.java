package string;

public class Ex5 {
    static String traVe(String raw, String from, String to){
        String chuoiTraVe = "";
        if (raw.contains(from)){
            chuoiTraVe = raw.replace(from, to);
        }
        return chuoiTraVe;
    }

    public static void main(String[] args) {
        String chuoiBanDau = "I am fresher";
        String chuoiSau = traVe(chuoiBanDau, "fresher", "senior");
        System.out.println(chuoiSau);
        //raw = I am fresher
        //from = fresher
        //to = senior
        //I am senior
    }
}
