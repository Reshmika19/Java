package StringsProb;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "Reshmika K S    is a B.Tech IT      Student";
        s= s.replaceAll("\\s","");
        System.out.println(s);
    }
}
