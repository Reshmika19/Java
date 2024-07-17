package Recursion;

public class Rope {
    public static void main(String[] args) {
        int max = maxPieces(20 , 5, 10, 7 );
        System.out.println(max);
    }
    static int maxPieces(int n , int a , int b , int c){
        if(n == 0) return 0;
        if(n < 0) return -1;
        int temp1 = maxPieces(n-a,a,b,c);
        int temp2 = maxPieces(n-b , a , b, c);
        int temp3 = maxPieces(n-c , a, b, c);

        int pieces = Math.max(temp3 , Math.max(temp1 , temp2));
        if(pieces < 0) return -1;

        return pieces+1;
    }
}
