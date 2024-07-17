package Recursion;

public class SievePrime {
    static void Sieve(int n){
        boolean[] prime = new boolean[n+1];
        for(int i = 2 ; i*i<=n ; i++){
            if(prime[i] == false){
                for(int j = i * i; j<= n ; j= j +i){
                    prime[j] = true;
                }
            }
        }
        for (int i = 2 ; i<=n ; i++){
            if(prime[i] == false){
                System.out.print(i + " ");
            }
        }
    }
    //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

    public static void main(String[] args) {
        int n = 50;
        Sieve(n);
    }
}
