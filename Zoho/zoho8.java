package Zoho;

public class zoho8 {
    public static void main(String[] args) {
        int n = 5;

        int space = 2 * n - 2;
        for(int i = 1 ; i< n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j<=space ; j++){
                System.out.print("-");
            }
            for(int j = 1 ; j<= i ; j++){
                System.out.print("*");
            }

            space -= 2;
            System.out.println();
        }
        space = 0;
        for(int i = n ; i>0 ; i--){
            //star
            for(int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j<space ; j++){
                System.out.print("-");
            }
            for(int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }

    }
}
