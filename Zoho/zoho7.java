package Zoho;

public class zoho7 {
    public static void main(String[] args) {
        int n = 7;
        int space = 0;
        int star = n*2-1;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<space ; j++){
                System.out.print(" ");
            }
            space++;
            for(int j = 0 ; j<star; j++){
                System.out.print("*");
            }
            star -=2;
            System.out.println();
        }
    }
}
