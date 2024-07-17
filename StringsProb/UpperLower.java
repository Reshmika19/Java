package StringsProb;

public class UpperLower {
    public static void main(String[] args) {
        String str = "RESHMIKAKS";
        char[] s = str.toCharArray();
        int size = str.length();
        char[] lower = new char[size];
        int i = 0;
        while(i!=size){
            lower[i] = (char) (s[i] + 32);
            i++;
        }
        System.out.println(lower);
    }
}
