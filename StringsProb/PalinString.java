package StringsProb;

public class PalinString {
    public static void main(String[] args) {
        String s = "too hot to HOOT";
        s = s.replace(" ","");
        boolean val = true;
//        for(int i = 0 ; i<=s.length()/2 ; i++){
//
////            if(s.charAt(i) == s.charAt(s.length() - i - 1) ){
////                    val = true;
////            }
////            else {
////                val = false;
////                break;
////            }
//            char c1 = Character.toLowerCase(s.charAt(i));
//            char c2 = Character.toLowerCase(s.charAt(s.length() - i -1));
//            if(c1 != c2){
//                val = false;
//                break;
//            }
//        }
//        if(val){
//            System.out.println("Palindrome");
//        }
//        else
//            System.out.println("Not a palindrome");
        // using while loop
        int size = s.length();
        int i = 0;
        while(i!=size){
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(s.length() - i -1));
            if(c1 != c2){
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
            else {
                i++;
                continue;
            }

        }
        System.out.println("Palindrome");
    }
}
