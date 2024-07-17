package Zoho;

public class zoho5 {
    //pattern
    public static void main(String[] args) {
        int n = 11;
        int outerSpace = n/2;
        int innerSpace = 1;
        for(int i = 0 ; i<n ; i++){
            //outerspace
            for(int j = 0 ; j<outerSpace ; j++){
                System.out.print(" ");
            }
            if(i < n/2 )  outerSpace -=1;

            else outerSpace += 1;

            //space
            if(i==0 || i == n-1){
                System.out.print("*");
            }
            else{
                System.out.print("*");

                for(int j = 0 ; j<innerSpace ; j++){
                    System.out.print("-");
                }
                if(i<n/2){
                    innerSpace += 2;
                }
                else innerSpace -= 2;

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
