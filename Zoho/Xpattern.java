package Zoho;

public class Xpattern {
    public static void main(String[] args) {
        String s = "12345";
        //System.out.println(s.charAt(0));
        int n = s.length();
        char[][] arr = new char[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if(i == j || i+j == n-1){
                    arr[i][j] =  s.charAt(j);
                }
                else{
                    arr[i][j] = ' ';
                }

            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
