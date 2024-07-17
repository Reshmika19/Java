package Recursion;

public class LookAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(1);
        int i = 1;
        String s = "1";

//        while(i<n){
//            String newS = "";
//            int count = 1;
//            char a = s.charAt(0);
//
//            for(int j = 1 ; j<s.length() ; j++){
//                if(s.charAt(j) != s.charAt(j-1)){
//                    //System.out.print(count + "" + a);
//                    newS += "" + count + "" + a;
//                    a = s.charAt(j);
//                    count = 1;
//                }else
//                    count++;
//            }
//            //System.out.println(count +  "" + a);
//            newS += "" + count + "" + a;
//            s = newS;
//            i++;
//        }
//        System.out.println(s);
        while(i<n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char a = s.charAt(0);

            for(int j = 1 ; j<s.length() ; j++){
                if(s.charAt(j) != s.charAt(j-1)){
                    System.out.print(count + "" + a);
                    sb.append(count);
                    sb.append(a);
                    a = s.charAt(j);
                    count = 1;
                }else
                    count++;
            }
            System.out.println(count +  "" + a);
            sb.append(count);
            sb.append(a);
            s = sb.toString();
            i++;
        }
        //System.out.println(s);
    }
}
