package Recursion;

public class ToH {
    public static void main(String[] args) {
        int n = 5;
        TowersOfHanoi(n , 'A' ,'B' ,'C');
    }
    static void TowersOfHanoi(int n , char src , char aux , char dest){
        if(n==1){
            System.out.println(src + "->" + dest);
            return;
        }

        TowersOfHanoi(n-1 , src , dest , aux);
        TowersOfHanoi(1 , src , aux , dest);
        TowersOfHanoi(n-1 , aux , src ,dest);
    }
}
