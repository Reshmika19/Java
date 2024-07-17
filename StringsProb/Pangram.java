package StringsProb;

public class Pangram {
    public static void main(String[] args) {
        String s = "The Quick brown fox jumps over a lazy dog";
        s = s.toLowerCase();

        s=s.replace(" ","");
        System.out.println(s);
        int size = s.length();

        char[] c = s.toCharArray();

        int[] a = new int[26];
        for(int i = 0 ; i<26 ; i++){
            a[i] = 0;
        }

        int i = 0;
        while (i!=size) {
            int ind = c[i] - 97;
            a[ind] = 1;
            i++;
        }
        i = 0;
        while(i!=26){
            if(a[i] == 1){
                i++;
            }
            else{
                System.out.println("Not pangram!");
                System.exit(0);
            }

        }
        System.out.println("PANGRAM!");
    }
}
