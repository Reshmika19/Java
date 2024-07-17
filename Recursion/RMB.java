package Recursion;

import java.util.Scanner;

public class RMB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(RightMostBit(n));
    }
    static int RightMostBit(int n ){
//        int pos = 1;
//        int m = 1;
//        if(n==0){
//            return 0;
//        }
//        while((n & m) == 0){
//            m = m<<1;
//            pos++;
//        }
//        return pos;

        return (int) (Math.log10(n ^ (n & (n-1))) / Math.log10(2)) + 1;
    }
}
