package StringsProb;

import java.util.Scanner;

public class GCDBrute {
    static  int gcd(int a , int b){
        int min = Math.min(a,b);
        for(int i = min ; i>=1 ; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    static int eucli(int a , int b){
        //int max = Math.max(a,b);
        while (a!=b){
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }
    static  int lame(int a , int b){
        while(a!=0 && b!=0){
            if(a>b)
                a = a%b;
            else
                b = b%a;
        }
        if(a!=0){
            return a;
        }
        else
            return b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lame(a,b));
    }
}
