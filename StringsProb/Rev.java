package StringsProb;


public class Rev {
    public static void main(String[] args) {
        String s = "BELIEVE AND HOPE";
        char[] o = s.toCharArray();
        char[] rev = new char[o.length];
//        int j = 0;
//        for(int i = o.length - 1 ; i>=0 ; i--){
//            rev[j] = o[i];
//            j++;
//        }
//        System.out.println(rev);

        int i = 0;
        int size = o.length;
        while(i!=size){
            rev[size-i-1] = o[i];
            i++;
        }
        System.out.println("The reversed string is ");
        System.out.println(rev );
    }

}
