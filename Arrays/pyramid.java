import java.util.Scanner;

public class pyramid {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int start=1;
            int result=0;
            int colDecrement=0;
            int n=sc.nextInt();

            for (int row = 1; row <=n; row++) {
                result=start;
                for (int white = 0; white <= n-row-1; white++) {
                    System.out.print("  ");
                }
                for (int col = n-row+1; col <=n; col++) {
                    if(row==1){
                        System.out.print(1 +" ");
                    }
                    else if(col == n-row+1){
                        System.out.print(start+" " );
                    }
                    else{

                        System.out.print(result -colDecrement +" ");
                        result= result-colDecrement;
                        colDecrement++;
                    }
                }
                colDecrement=n-row;
                start=start+n-row+1;
                System.out.println();
            }
        }

}
