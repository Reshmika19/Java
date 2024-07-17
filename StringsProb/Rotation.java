package StringsProb;

public class Rotation {
    public static void main(String[] args) {
        String s = "reshmika";
        String key = "eshmikar";

        s = s.concat(s);

        if(s.contains(key)){
            System.out.println("Rotational String");
        }else {
            System.out.println("Not Rotational String");
        }
    }
}
