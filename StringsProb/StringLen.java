package StringsProb;

public class StringLen {
    public static void main(String[] args){
        String str = "Reshmika B.Tech(HONS)";
        str = str.concat("\0");
        char y[] = str.toCharArray();
        int i =0;
//        for( i = 0 ; str.charAt(i)!='\0' ; i++){
//
//        }
        int count = 0;
        while(y[i]!='\0'){
            ++count; ++i;
        }
        System.out.println("Length of the given String " + " is " + count);
    }

}
